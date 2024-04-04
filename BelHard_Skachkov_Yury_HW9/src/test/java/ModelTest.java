import org.testng.Assert;
import org.testng.annotations.*;

public class ModelTest {

    @BeforeSuite
    public void suiteSetup(){//начало тестов
        System.out.println("Seeding data");
    }

    @AfterSuite
    public void suiteTearDown(){//окончание тестов
        System.out.println("Clearing data");
    }

    @BeforeTest
    public void testSetup(){//запуск после BeforeSuite
        System.out.println("DB connect");
    }

    @AfterTest
    public void testTearDown(){//запуск перед AfterSuite
        System.out.println("DB connection reset");
    }

    @BeforeGroups("positive")
    public void positiveGroupSetup(){//подготовка перед запуском группы positive
        System.out.println("Preparing to run positive");
    }

    @AfterGroups("positive")
    public void positiveGroupTearDown(){//подготовка перед запуском группы negative
        System.out.println("Taking a rest after positive run");
    }

    @BeforeGroups("negative")
    public void negativeGroupSetup(){//подготовка перед запуском группы positive
        System.out.println("Preparing to run negative");
    }

    @AfterGroups("negative")
    public void negativeGroupTearDown(){//подготовка перед запуском группы negative
        System.out.println("Taking a rest after negative run");
    }
    @BeforeClass
    public void classSetup() {//запускается перед тестовым классом
        System.out.println("I will run before class");
    }

    @AfterClass
    public void classTearDown() {//запускается после тестового класса
        System.out.println("I will run after class");
    }

    @BeforeMethod
    public void methodSetup() {//запускается перед каждым тестовым методом MyFirstTest(), SecondTest() и т.д.
        System.out.println("Preparing for method");
    }

    @AfterMethod
    public void methodTearDown() {//запускается после каждого тестового метода MyFirstTest(), SecondTest() и т.д.
        System.out.println("Clearing up after method");
    }


    @Test(groups = "positive")//установили группу "positive"
    public void shouldReturnCorrectBrend(){
        String brend = "Audi";
        Transport testTransport = new Transport(100, 200, 25, "Audi");
        Assert.assertEquals(testTransport.getBrend(), brend);
        System.out.println("My 1 positive unit-test");
    }

    @Test(groups = "positive")//установили группу "positive"
    public void shouldReturnCorrectNumberWheels(){
        int wheels = 4;
        GroundTransport testGroundTransport = new GroundTransport(100, 200, 25, "Audi", 4, 80);
        Assert.assertEquals(testGroundTransport.getWheels(), wheels);
        System.out.println("My 2 positive unit-test");
    }

    @Test(groups = "negative")//установили группу "negative"
    public void shouldReturnErrorBrend() throws InterruptedException {
        String brend = "Audi";
        Transport testTransport = new Transport(100, 200, 25, "BMV");
        Assert.assertEquals(testTransport.getBrend(), brend);
        System.out.println("My 1 negative unit-test");
        Thread.sleep(1000);
    }

    @Test(groups = "negative")//установили группу "negative"
    public void shouldReturnErrorAfterEnterNumberWheelsLess4(){
        int wheels = 4;
        GroundTransport testGroundTransport = new GroundTransport(100, 200, 25, "Audi", 3, 80);
        Assert.assertEquals(testGroundTransport.getWheels(), wheels);
        System.out.println("My 2 negative unit-test");
    }

    @Test(groups = "negative")//установили группу "negative"
    public void shouldReturnErrorAfterEnterNumberWheelsMore4(){
        int wheels = 4;
        GroundTransport testGroundTransport = new GroundTransport(100, 200, 25, "Audi", 5, 80);
        Assert.assertEquals(testGroundTransport.getWheels(), wheels);
        System.out.println("My 3 negative unit-test");
    }

}
