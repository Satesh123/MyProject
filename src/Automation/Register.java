package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.System.*;

public class Register {

    public static void main(String[] args) {

       setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       driver.get("https://www.nopcommerce.com/register");


       WebElement Fname = driver.findElementById("FirstName");
        Fname.sendKeys("John");
        WebElement Lname = driver.findElementById("LastName");
        Lname.sendKeys("Smith");
        WebElement Email = driver.findElementById("Email");
        Email.sendKeys("johnsmith@gmail.com");
        WebElement ConfirmEmail = driver.findElementById("ConfirmEmail");
        ConfirmEmail.sendKeys("johnsmith@gmail.com");
        WebElement Username = driver.findElementById("Username");
        Username.sendKeys("John123");

        WebElement check = driver.findElementById("check-availability-button");
        check.click();

        Select Country = new Select(driver.findElementById("CountryId"));
        Country.selectByVisibleText("United Kingdom");

        Select Companyroll = new Select(driver.findElementById("CompanyRoleId"));
        Companyroll.selectByVisibleText("Technical developer");

      //  WebElement tick = driver.findElementByName("Newsletter");
       // tick.click();

        Select Timezone = new Select(driver.findElementById("TimeZoneId"));
        Timezone.selectByValue("GMT Standard Time");

        WebElement Password = driver.findElementById("Password");
        Password.sendKeys("Password");

        WebElement ConfirmPassword = driver.findElementById("ConfirmPassword");
        ConfirmPassword.sendKeys("Password");

        WebElement Register = driver.findElementById("register-button");
        Register.click();

        String actualUrl = "https://www.nopcommerce.com/register";
        String expectedUrl = driver.getCurrentUrl();

        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            out.println("Test Pass");
        } else {
            out.println("Test Failed");
        }
        driver.quit();

    }


}
