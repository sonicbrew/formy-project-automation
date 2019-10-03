import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/datepicker");

//        WebElement datepicker = driver.findElement(By.id("datepicker"));
//        datepicker.sendKeys("09/25/2019");
//        datepicker.sendKeys(Keys.RETURN);

        driver.findElement(By.id("datepicker")).sendKeys("09/25/2019");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);



    }
}