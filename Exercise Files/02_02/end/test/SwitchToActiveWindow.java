import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");

        driver.findElement(By.id("new-tab-button")).click();

//        driver.switchTo().window("http://formy-project.herokuapp.com/switch-window");

        String originalHandle = driver.getWindowHandle();

        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
    }
}
