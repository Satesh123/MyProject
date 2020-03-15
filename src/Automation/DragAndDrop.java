package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.System.setProperty;

public class DragAndDrop {
    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

        WebElement drag = driver.findElementById("draggable");
        WebElement drop = driver.findElementById("droppable");

        int x = drop.getLocation().getX();
        int y = drop.getLocation().getY();

        Actions test = new Actions(driver);
        test.dragAndDropBy(drag, x, y).build().perform();
    }
}
