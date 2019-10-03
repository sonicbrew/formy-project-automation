import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

//        driver.findElement(By.id("autocomplete")).sendKeys("1096 East Quail Valley Drive, Provo, UT, USA");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("1096 East Quail Valley Drive, Provo, UT, USA");

        Thread.sleep(1000);

        WebElement Searchresult = driver.findElement(By.className("pac-item"));

        Searchresult.click();

//        driver.quit();
    }
}


