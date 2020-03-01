package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.System.out;
import static java.lang.System.setProperty;


public class NewRegister {

    public static void main(String[] args) throws InterruptedException {

        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.nopcommerce.com/");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("span.ico-user.sprite-image")).click();
        driver.findElement(By.xpath("//*[@class='ico-register']")).click();
        String Register = driver.getTitle();
        out.println(Register);

        Thread.sleep(1000);

        driver.findElement(By.id("FirstName")).sendKeys("John");
        driver.findElement(By.name("LastName")).sendKeys("Smith");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Johnsmith1@gmail.com");
        driver.findElement(By.cssSelector("input#ConfirmEmail")).sendKeys("Johnsmith1@gmail.com");
        driver.findElementById("Username").sendKeys("smith134ac");
        driver.findElementById("check-availability-button").click();

        Thread.sleep(2000);

        String checkAva = driver.findElement(By.id("username-availabilty")).getText();
        String expectAva = "Username available";

        if (expectAva.equals(checkAva)) {
            out.println(expectAva + " asserted");
            Select Country = new Select(driver.findElementById("CountryId"));
            Country.selectByVisibleText("United Kingdom");
            Select Companyroll = new Select(driver.findElementById("CompanyRoleId"));
            Companyroll.selectByVisibleText("Technical developer");
            Select Timezone = new Select(driver.findElementById("TimeZoneId"));
            Timezone.selectByValue("GMT Standard Time");
            driver.findElementById("Password").sendKeys("Password");
            driver.findElementById("ConfirmPassword").sendKeys("Password");

            WebElement Submit = driver.findElementById("register-button");
            Submit.click();

        } else {
            out.println("Expected value is : " + expectAva + " but received " + checkAva);
        }
        String registration = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
        if (registration.equals("Your registration completed")) {
            System.out.println("Test case 1 passed");
        }

          driver.quit();


    }
}
