package PageObjectModel;

import ObjectRepository.nopRegistrationPage;
import ObjectRepository.nopehomepage;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;
    // Program using Page Object Model.
public class nopRegistration {

    public static void main(String[] args) throws InterruptedException {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com");
        driver.manage().window().maximize();

        nopehomepage homepage = new nopehomepage(driver);
        homepage.clickusericon();
        Thread.sleep(1000);
        homepage.clickregistericon();

        nopRegistrationPage RegPage = new nopRegistrationPage(driver);
        RegPage.FirstName();
        RegPage.LastName();
        RegPage.Email();
        RegPage.ConfirmEmail();
        RegPage.Username();
        RegPage.CheckAvailability();
        RegPage.Countryselect();
        RegPage.Companyrole();
        RegPage.Timezone();
        RegPage.Password();
        RegPage.Confirmpassword();
        RegPage.Register();

    }
}
