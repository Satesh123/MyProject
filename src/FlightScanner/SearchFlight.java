package FlightScanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlight {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ticketstoindia.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("OneWay")).click();
        //Select flyfom = new Select();


    }


}


