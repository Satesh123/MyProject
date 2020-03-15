package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;
import static java.lang.System.setProperty;

public class verifyLogIn {

    public static void main(String[] args) {
       // setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login");

        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("sriram.angajala@gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("London12");

        WebElement login = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input"));
        login.click();

        WebElement isPresent = driver.findElementByLinkText("My account");

        if(isPresent.isDisplayed()) out.println("Test Pass");
        else out.println("Test Fail");

        driver.quit();

    }
}
