package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.System.setProperty;

public class AlertTest {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.southalltravel.co.uk//");

        //  Actions action = new Actions(driver);
        //action.sendKeys(Keys.PAGE_DOWN).build().perform();

        driver.findElement(By.id("button_flight_search")).click();
        Alert aletr = driver.switchTo().alert();
        String alerttxt = aletr.getText();
        System.out.println(alerttxt);
        aletr.accept();

        driver.quit();


    }
}
