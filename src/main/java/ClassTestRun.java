
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTestRun {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        start(ClassTestOne.class);
        System.out.println();
        start(ClassTestTwo.class);
    }

    public static void start(Class classTest) throws InstantiationException, IllegalAccessException {
        Method methods[] = classTest.getDeclaredMethods();
        int n = 0;
        int k = 0;
        for (Method o : methods){
            if (o.getAnnotation(BeforeSuite.class) != null){
                n = n + 1;
            }
            if (o.getAnnotation(AfterSuite.class) != null){
                k = k + 1;
            }
        }
        if (n < 1 || k < 1){
            throw new RuntimeException();
        }

        Object obj = classTest.newInstance();
        try {
            for (Method ob : methods){
                if (ob.getAnnotation(BeforeSuite.class) != null){
                    ob.invoke(obj);
                    break;
                }
            }
            for (Method ob : methods){
                if (ob.getAnnotation(Test.class) != null){
                    ob.invoke(obj);
                }
            }
            for (Method ob : methods){
                if (ob.getAnnotation(AfterSuite.class) != null){
                    ob.invoke(obj);
                    break;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
