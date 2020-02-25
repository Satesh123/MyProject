package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.System.*;
import static java.lang.System.setProperty;

public class Autologintest {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        /* Above path according to individual machine and not the same as mine.
        Rest of the programme should b the same. */
        ChromeDriver driver = new ChromeDriver(); //driver.manage().window().maximize();
        driver.get("https://www.nopcommerce.com/login");

        WebElement username=driver.findElement(By.id("Username"));
        username.sendKeys(new CharSequence[]{"example@gmail.com"});

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys(new CharSequence[]{"Password"});

        WebElement login;
        login = driver.findElement(By.xpath("/html/body/div[6]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input"));
        login.click();

        String actualUrl = "https://www.nopcommerce.com/login";
        String expectedUrl= driver.getCurrentUrl();

       if(actualUrl.equalsIgnoreCase(expectedUrl)) out.println("Test passed");
       else out.println("Test failed");

        driver.quit();
    }
}
