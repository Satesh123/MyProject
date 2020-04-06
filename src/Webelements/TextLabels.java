package Webelements;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.junit.Assert.assertEquals;

public class TextLabels {
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
    public void TextLabels() {
        //  Actions action = new Actions(driver);
        // action.sendKeys(Keys.PAGE_DOWN).build().perform();
        //   action.sendKeys(Keys.PAGE_DOWN).build().perform();
        WebElement Labels = driver.findElement(By.xpath("//*[@id=\"Text1\"]/div[1]/div[1]/span"));
        Labels.isDisplayed();

        String actualtxt = Labels.getText();

        assertEquals("Check labels", "Message-123", actualtxt);
        System.out.println("Verification Successful");

    }
    @AfterClass
    public static void Aftertest(){
        driver.quit();
    }

}
