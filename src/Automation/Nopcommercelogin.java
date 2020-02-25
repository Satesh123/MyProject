package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.System.out;
import static java.lang.System.setProperty;

public class Nopcommercelogin {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");

        WebDriver obj = new ChromeDriver();

        obj.navigate().to("https://www.nopcommerce.com/login");
        String title = obj.getTitle();

        if (title.equals("Login - nopCommerce")) out.println("Pass");
        else
           out.println("Fail");

        obj.quit();



    }
}
