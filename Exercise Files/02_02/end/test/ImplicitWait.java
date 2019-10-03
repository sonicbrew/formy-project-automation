import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("1096 East Quail Valley Drive, Provo, UT, USA");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();

    }
}