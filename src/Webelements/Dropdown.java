package Webelements;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.junit.Assert.assertEquals;

public class Dropdown {

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
    public void SelectSpeed() {

        Select select = new Select(driver.findElement(By.id("speed")));
        select.selectByIndex(3);

        String Stxt = select.getFirstSelectedOption().getText();
        assertEquals("Result", "Fast", Stxt.trim());
        System.out.println("Test Pass");
    }

    @Test
    public void Selectfile() {

        Select file = new Select(driver.findElement(By.id("files")));
        file.selectByValue("3");

        String Sfile = file.getFirstSelectedOption().getText();
        assertEquals("Result", "DOC file", Sfile.trim());
        System.out.println("Test Pass");
    }

    @Test
    public void SelectNum() {
        Select number = new Select(driver.findElement(By.id("number")));
        number.selectByIndex(3);

        String Snumber = number.getFirstSelectedOption().getText();
        assertEquals("Result", "4", Snumber.trim() );
        System.out.println("Test Pass");

    }

    @Test
    public void SelectProduct() {

        Select product = new Select(driver.findElement(By.id("products")));
        product.selectByIndex(2);

        String Sproduct = product.getFirstSelectedOption().getText();
        assertEquals("Result", "Iphone",Sproduct.trim());
        System.out.println("Test Pass");
    }

    @Test
    public void SelectAnimal() {
        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByVisibleText("Avatar");

        String Sanimal = animals.getFirstSelectedOption().getText();
        assertEquals("Result", "Avatar", Sanimal.trim());
        System.out.println("Test Pass");

    }

    @AfterClass
    public static void Aftertest(){
        driver.quit();
    }

}
