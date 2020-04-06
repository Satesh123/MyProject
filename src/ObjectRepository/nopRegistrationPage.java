package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
// Creating functions and methods for Page object model.
public class nopRegistrationPage {
    WebDriver driver;

    public nopRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By Email = By.id("Email");
    By ConfirmEmail = By.id("ConfirmEmail");
    By Username = By.id("Username");
    By checkAvailability = By.id("check-availability-button");
    By Country = By.id("CountryId");
    By CompanyRole = By.id("CompanyRoleId");
    By TimeZone = By.id("TimeZoneId");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By Register = By.id("register-button");

    public void FirstName() {
        driver.findElement(FirstName).sendKeys("Smith");
    }

    public void LastName() {
        driver.findElement(LastName).sendKeys("John");
    }

    public void Email() {
        driver.findElement(Email).sendKeys("Smithjohn1@gmail.com");
    }

    public void ConfirmEmail() {
        driver.findElement(ConfirmEmail).sendKeys("Smithjohn1@gmail.com");
    }

    public void Username() {
        driver.findElement(Username).sendKeys("SJ1254");
    }

    public void CheckAvailability() {
        driver.findElement(checkAvailability).click();
    }

    public void Countryselect() {
        Select selectcountry = new Select(driver.findElement(Country));
        selectcountry.selectByVisibleText("United Kingdom");
    }

    public void Companyrole() {
        Select copmanyrole = new Select(driver.findElement(CompanyRole));
        copmanyrole.selectByIndex(0);
    }

    public void Timezone() {
        Select timezone = new Select(driver.findElement(TimeZone));
        timezone.selectByValue("GMT Standard Time");
    }

    public void Password() {
        driver.findElement(Password).sendKeys("password");
    }

    public void Confirmpassword() {
        driver.findElement(ConfirmPassword).sendKeys("password");
    }

    public void Register() {
        driver.findElement(Register).click();
    }
}
