package Webelements;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.System.setProperty;

public class DoubleClickTest {

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
    }

    @Test
    public void doubleClickTest() throws InterruptedException {

        Actions action = new Actions(driver);
        WebElement dblclick = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
        action.doubleClick(dblclick).build().perform();

        Thread.sleep(2000);

        String field1 = driver.findElement(By.id("field1")).getText();

        String field2 = driver.findElement(By.id("field2")).getText();

        Assert.assertEquals("Check Text match", field1, field2);

        System.out.println("Verification Successful");

    }

    @AfterClass
    public static void afterTest() {
        driver.quit();
    }

}
