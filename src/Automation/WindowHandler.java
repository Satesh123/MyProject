package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class WindowHandler {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.getTitle();
        System.out.println(driver);

        driver.findElementByXPath("//*[@id=\"Tabbed\"]/a/button").click();

        Set<String> window = driver.getWindowHandles();
        Iterator<String> iterator = window.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        String childw = driver.getWindowHandle();
        driver.switchTo().window(childWindow);

        System.out.println(childw);
        System.out.println(parentWindow);
        System.out.println(childWindow);

        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());

        driver.quit();


    }
}
