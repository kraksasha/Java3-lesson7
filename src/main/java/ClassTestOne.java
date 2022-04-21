
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassTestOne {

    @BeforeSuite
    public void methodBefore(){
        System.out.println("Тест класса ClassTestOne c анотацией @BeforeSuite выполнен");
    }

    @Test(priority = 1)
    public void methodOne(){
        System.out.println("methodOne класса ClassTestOne выполнен");
    }

    @Test(priority = 2)
    public void methodTwo(){
        System.out.println("methodTwo класса ClassTestOne выполнен");
    }

    @AfterSuite
    public void methodAfter(){
        System.out.println("Тест класса ClassTestOne c анотацией @AfterSuite выполнен");
    }

}
