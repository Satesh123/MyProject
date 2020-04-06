package Webelements;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.junit.Assert.assertEquals;

public class AlertHandel {
    public static WebDriver driver;

    @BeforeClass
    public static void BeforeTest() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
    }

    @Before
    public void BeforeMethod() {
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void AlertTest() {
        driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();

        Alert alert = driver.switchTo().alert();
        String alerttxt = alert.getText();
        assertEquals("Result", "Press a button!", alerttxt);

        System.out.println("Verification Successful");

    }

    @AfterClass
    public static void afterTest() {
        driver.quit();
    }
}
