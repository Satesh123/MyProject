package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.List;

import static java.lang.System.setProperty;

public class autoSuggestEditBox {

    public static void main(String[] args) throws InterruptedException {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Computer");

        Thread.sleep(2000);
        List<WebElement>lst = driver.findElements(By.xpath("//ul[@class='erkvQe']"));

        Thread.sleep(2000);
        for (int i=0; i<lst.size(); i++)
        {
            System.out.println(lst.get(i).getText());
        }

        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);

        driver.quit();



    }
}
