package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.*;

public class FirstProgram {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        WebDriver obj = new ChromeDriver();

        obj.navigate().to("https://www.bbc.co.uk/");
        String title = obj.getTitle();

        if (title.equals("BBC - Home")) out.println("Pass");
        else out.println("Fail");



    }
}
