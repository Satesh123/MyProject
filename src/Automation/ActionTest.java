package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class ActionTest {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions builder = new Actions(driver);
        WebElement icon = driver.findElement(By.cssSelector("span.ico-user.sprite-image"));
        builder.moveToElement(icon).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ico-register']")));

        builder.moveToElement(driver.findElement(By.xpath("//*[@class='ico-register']"))).build().perform();
        builder.click().build().perform();

        Action steps = builder
                .keyDown(Keys.SHIFT).sendKeys(driver.findElement(By.id("FirstName")), "Robert")
                .keyUp(Keys.SHIFT).sendKeys(driver.findElement(By.name("LastName")), "Smith")
                .sendKeys(driver.findElement(By.xpath("//input[@id='Email']")), "robertsmith@gmail.com")
                .sendKeys(driver.findElement(By.cssSelector("input#ConfirmEmail")), "robertsmith@gmail.com")
                .sendKeys(driver.findElement(By.id("Username")), "Robert12c")
                .moveToElement(driver.findElement(By.id("check-availability-button"))).click().build();
        steps.perform();

        driver.quit();


    }
}
