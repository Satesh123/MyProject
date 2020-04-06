package Junit;

import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class webElements {
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

    @Test
    public void AlertTest() {
        driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();

        Alert alert = driver.switchTo().alert();
        String alerttxt = alert.getText();
        assertEquals("button click test", "Press a button!", alerttxt);

        System.out.println("Verification Successful");

    }

    @Test
    public void SelectSpeed() {

        Select select = new Select(driver.findElement(By.id("speed")));
        select.selectByIndex(3);

        String Stxt = select.getFirstSelectedOption().getText();
        assertEquals("Ckeck selected option", "Fast", Stxt.trim());
        System.out.println("Verification Successful");
    }

    @Test
    public void Selectfile() {

        Select file = new Select(driver.findElement(By.id("files")));
        file.selectByValue("3");

        String Sfile = file.getFirstSelectedOption().getText();
        assertEquals("Check selected option", "DOC file", Sfile.trim());
        System.out.println("Verification Successful");
    }

    @Test
    public void SelectNum() {
        Select number = new Select(driver.findElement(By.id("number")));
        number.selectByIndex(3);

        String Snumber = number.getFirstSelectedOption().getText();
        assertEquals("Check selected number", "4", Snumber.trim() );
        System.out.println("Verification Successful");

    }

    @Test
    public void SelectProduct() {

        Select product = new Select(driver.findElement(By.id("products")));
        product.selectByIndex(2);

        String Sproduct = product.getFirstSelectedOption().getText();
        assertEquals("Check Selected Product", "Iphone",Sproduct.trim());
        System.out.println("Verification Successful");
    }

    @Test
    public void SelectAnimal() {
        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByVisibleText("Avatar");

        String Sanimal = animals.getFirstSelectedOption().getText();
        assertEquals("Check selected animal", "Avatar", Sanimal.trim());
        System.out.println("Verification Successful");

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
    public static void test() {
        System.out.println("All Test Complete");
    }

}
