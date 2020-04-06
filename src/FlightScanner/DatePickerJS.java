package FlightScanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerJS {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ticketstoindia.co.uk/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement date = driver.findElement(By.id("FDptDateDDMMYY"));
        date.click();
        WebElement dateval = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]/a"));
        dateval.click();


    }

}
