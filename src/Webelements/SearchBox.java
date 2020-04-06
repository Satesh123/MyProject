package Webelements;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.junit.Assert.assertTrue;

public class SearchBox {

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
    public void Search() throws InterruptedException {
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Computer");
        driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();

        Thread.sleep(2000);
        boolean linkTxt = driver.findElement(By.linkText("Computer")).isDisplayed();
        assertTrue("Compter search test", linkTxt);
        System.out.println("Verificatiuon Successful");
    }
    @AfterClass
    public static void Aftertest(){
        driver.quit();
    }
}