package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.System.out;



public class NewRegister {

    public static void main(String[] args) throws InterruptedException {

      //  setProperty("webdriver.chrome.driver", "satesh$ \\Users\\satesh\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.nopcommerce.com/");

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("span.ico-user.sprite-image")).click();
        driver.findElement(By.xpath("//*[@class='ico-register']")).click();
        String label = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        out.println(label);

        Thread.sleep(1000);

        if (label.equals("Register")) {
            driver.findElement(By.id("FirstName")).sendKeys("John");
            driver.findElement(By.name("LastName")).sendKeys("Smith");
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Johnsmith7123@gmail.com");
            driver.findElement(By.cssSelector("input#ConfirmEmail")).sendKeys("Johnsmith7123@gmail.com");
            driver.findElementById("Username").sendKeys("smith472fae");
            driver.findElementById("check-availability-button").click();


            Thread.sleep(2000);

            String checkAva = driver.findElement(By.id("username-availabilty")).getText();
            String expectAva = "Username available";


            if (expectAva.equals(checkAva)) {
                out.println(expectAva);

                Select Country = new Select(driver.findElementById("CountryId"));
                Country.selectByVisibleText("United Kingdom");
                Select Companyroll = new Select(driver.findElementById("CompanyRoleId"));
                Companyroll.selectByVisibleText("Technical developer");
                driver.findElement(By.className("custom-control-label")).click();
                boolean newsLetter = driver.findElement(By.className("custom-control-label")).isSelected();
                out.println(newsLetter);
                Select Timezone = new Select(driver.findElementById("TimeZoneId"));
                Timezone.selectByValue("GMT Standard Time");
                driver.findElementById("Password").sendKeys("Password");
                driver.findElementById("ConfirmPassword").sendKeys("Password");

                WebElement Submit = driver.findElementById("register-button");
                Submit.click();

                Thread.sleep(1000);

                String registration = driver.findElement(By.xpath("//div[@class='bar-notification success']/p")).getText();
                if (registration.equals("Your registration completed")) out.println("Test Case Passed");
            } else out.println("Test Case fail");
        }
        driver.quit();

    }
}
