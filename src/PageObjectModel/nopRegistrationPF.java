package PageObjectModel;

import ObjectRepository.nopRegistrationPage;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;
//Program using Page Factory.
public class nopRegistrationPF {
    public static void main(String[] args) throws InterruptedException {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com");
        driver.manage().window().maximize();

        nopHomePageFactory homepage = new nopHomePageFactory(driver);
        homepage.clickUserIcon();
        Thread.sleep(1000);
        homepage.clickRegister();

        nopRegistrationPage register = new nopRegistrationPage(driver);
        register.FirstName();
        register.LastName();
        register.Email();
        register.ConfirmEmail();
        register.Username();
        register.CheckAvailability();
        register.Countryselect();
        register.Companyrole();
        register.Timezone();
        register.Password();
        register.Confirmpassword();
        register.Register();

    }
}
