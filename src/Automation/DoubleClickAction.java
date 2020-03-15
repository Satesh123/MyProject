package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import static java.lang.System.setProperty;

public class DoubleClickAction {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://api.jquery.com/dblclick/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.switchTo().frame(0);
        Actions action = new Actions(driver);
        WebElement dblclick = driver.findElementByXPath("/html/body/div");
        action.doubleClick(dblclick).build().perform();

        driver.quit();

    }
}
