import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        Thread.sleep(3000);

        js.executeScript("arguments[0].click();", closeButton);

        Thread.sleep(3000);

        driver.quit();
    }
}