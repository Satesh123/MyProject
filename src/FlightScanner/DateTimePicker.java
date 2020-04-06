package FlightScanner;


import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimePicker {
    @Test
    public void DateTimePicker(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/");
        driver.manage().window().maximize();

        WebElement Datebox = driver.findElement(By.xpath("/html/body/form/input[1]"));
        Datebox.sendKeys("09252013");
        Datebox.sendKeys(Keys.TAB);
        Datebox.sendKeys("0245PM");

    }
    @Ignore("Test not complete")
    @Test
    public void TestDatePicket(){
    }

}