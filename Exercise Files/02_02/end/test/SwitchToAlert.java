import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert =  driver.switchTo().alert();
        alert.accept();

        driver.quit();





    }
}