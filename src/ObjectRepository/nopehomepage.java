package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nopehomepage {
    WebDriver  driver;

    public nopehomepage(WebDriver driver){
        this.driver = driver;
    }
    By usericon = By.cssSelector("span.ico-user.sprite-image");
    By Registericon = By.xpath("//*[@class='ico-register']");

    public void clickusericon(){
        driver.findElement(usericon).click();
    }
    public void clickregistericon(){
        driver.findElement(Registericon).click();
    }

}
