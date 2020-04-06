package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nopHomePageFactory {
    WebDriver driver;
    public nopHomePageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "span.ico-user.sprite-image")
    WebElement usericon;
    @FindBy(xpath = "//*[@class='ico-register']")
    WebElement Registericon;

    public void clickUserIcon(){
        usericon.click();
    }
    public void clickRegister(){
        Registericon.click();
    }

}
