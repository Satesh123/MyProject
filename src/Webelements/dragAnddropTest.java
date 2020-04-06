package Webelements;

import Automation.DragAndDrop;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class dragAnddropTest {

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
    public void DrageandDroptest() {
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

//        int x = drag.getLocation().getX();
//        int y = drop.getLocation().getY();

        Actions test = new Actions(driver);
        test.dragAndDrop(drag, drop).perform();
        String dropTxt = drop.getText();
        Assert.assertEquals("Result", "Dropped!", dropTxt );

        System.out.println("Verification Successful");
    }
    @AfterClass
    public static void afterTest(){
        driver.quit();
    }
}
