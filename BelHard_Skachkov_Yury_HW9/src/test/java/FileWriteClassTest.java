import org.testng.Assert;
import org.testng.annotations.*;
import java.io.FileReader;
import java.io.IOException;

public class FileWriteClassTest {

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
    public void shouldReadCorrectFile() throws IOException {
        FileReader testFileReader = new FileReader("src/main/java/resources/FileWriter.txt");
        Assert.assertTrue(true,"File found");
        int i;//считываем каждый байт в переменную i
        while ((i = testFileReader.read()) != -1) {
            System.out.print((char) i);//
        }
        System.out.println("My 3 positive unit-test");
    }

    @Test(groups = "negative")//установили группу "negative"
    public void shouldNotReadCorrectFile() throws IOException {
        FileReader testFileReader = new FileReader("src/main/java/resources/FileWrite.txt");
        Assert.assertFalse(true,"File not found");
        int i;//считываем каждый байт в переменную i
        while ((i = testFileReader.read()) != -1) {
            System.out.print((char) i);//
        }
        System.out.println("My 4 negative unit-test");
    }
}

