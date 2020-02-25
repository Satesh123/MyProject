package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;
import static java.lang.System.setProperty;

public class verifyProductDetail {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login");

        WebElement search = driver.findElementById("small-searchterms");
        search.sendKeys("Computer");

        WebElement searchButton = driver.findElementByXPath("//*[@id=\"small-search-box-form\"]/input[2]");
        searchButton.click();

        WebElement productInfo = driver.findElementByLinkText("Build your own computer");
        productInfo.click();

       WebElement isPresent = driver.findElementById("stock-availability-value-1");

      if(isPresent.isDisplayed()) out.println("Test Pass");
       else out.println("Test Fail");

        driver.quit();

    }
}
