import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
public class SeleniumTest {

    @Test
    public void myFirstTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement id = driver.findElement(By.id("content"));//Выбираем id, где содержится список ссылок
        List<WebElement> elements = id.findElements(By.tagName("a"));//находим каждую ссылку в id
        for (WebElement element : elements) {
            System.out.println(element.getText());//вывод в консоль каждого элемента (ссылки) из elements
        }
        elements.get(9).click();
        driver.quit();
    }
}
