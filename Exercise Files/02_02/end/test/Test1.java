import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/scroll");

//        driver.findElement(By.id("name")).sendKeys("Eugene Shashkov");
//
//        driver.findElement(By.id("date")).sendKeys("09/19/2019");
//
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Eugene Shashkov");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("09/19/2019");


//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//
//        autocomplete.sendKeys("1096 East Quail Lane, Huntsville, UT, USA");
//
//        Thread.sleep(1000);
//
//        WebElement Searchresult = driver.findElement(By.className("pac-item"));
//
//        Searchresult.click();
//
//        driver.quit();
    }
}

