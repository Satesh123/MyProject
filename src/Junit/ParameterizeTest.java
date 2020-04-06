package Junit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.System.setProperty;

//Create a parameterized test class
@RunWith(Parameterized.class)
public class ParameterizeTest {
    public static WebDriver driver;
    private String username;
    private String password;
//Create a constructor that stores the test data.
    public ParameterizeTest(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{{"Abc", "Abc"}, {"xyz", "xyz"}, {"admin", "admin"}};
        return Arrays.asList(data);
    }
    @BeforeClass
    public static void BeforeTest(){
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
    }
    @Before
    public void BeforeMethod() throws InterruptedException {
        driver.get("https://www.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span.ico-user.sprite-image")).click();
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
    }
    @Test
    public void LoginTest() throws InterruptedException {
        driver.findElement(By.id("Username")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login-page\"]/body/div[6]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[5]/input")).click();
        Thread.sleep(5000);

    }



}
