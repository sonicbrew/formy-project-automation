import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.interactions.Actions;

public class Radiobutton {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver2");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton = driver.findElement(By.id("radio-button-1"));
        radioButton.click();

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();






    }
}