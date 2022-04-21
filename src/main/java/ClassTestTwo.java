import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassTestTwo {

    @BeforeSuite
    public void methodBefore(){
        System.out.println("Тест класса ClassTestTwo c анотацией @BeforeSuite выполнен");
    }

    @Test(priority = 1)
    public void methodOne(){
        System.out.println("methodOne класса ClassTestTwo выполнен");
    }

    @Test(priority = 2)
    public void methodTwo(){
        System.out.println("methodTwo класса ClassTestTwo выполнен");
    }

    @Test(priority = 3)
    public void methodThree(){
        System.out.println("methodThree класса ClassTestTwo выполнен");
    }

    @Test(priority = 4)
    public void methodFour(){
        System.out.println("methodFour класса ClassTestTwo выполнен");
    }

    @AfterSuite
    public void methodAfter(){
        System.out.println("Тест класса ClassTestTwo c анотацией @AfterSuite выполнен");
    }
}
