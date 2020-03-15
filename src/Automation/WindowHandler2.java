package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.lang.System.setProperty;

public class WindowHandler2 {
    public static void main(String[] args) {

        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.naukri.com/");
        String mainWindow = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();

        for (String childWindow : set) {
            if (!mainWindow.equals(childWindow)) {
                driver.switchTo().window(childWindow);
                System.out.println(driver.switchTo().window(childWindow).getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(mainWindow);
        driver.quit();

    }
}
