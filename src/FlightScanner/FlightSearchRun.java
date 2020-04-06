package FlightScanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearchRun {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ticketstoindia.co.uk/");
        driver.manage().window().maximize();

        FlightSearchPOM Fsearch = new FlightSearchPOM(driver);
        Fsearch.OneWay();
        Fsearch.FlyFrom();
        Fsearch.FlyTo();
        Fsearch.DepDate();
        Fsearch.RetDate();
        Fsearch.Adult();
        Fsearch.Child();
        Fsearch.Infant();
        Fsearch.AirLine();
        Fsearch.CabinClass();
        Fsearch.FlexSearch();
        Fsearch.NonStopF();
        Fsearch.SearchButton();


    }


}
