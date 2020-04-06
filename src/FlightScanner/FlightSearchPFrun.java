package FlightScanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearchPFrun {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ticketstoindia.co.uk/");
        driver.manage().window().maximize();

        FlightSearchPF FlightS = new FlightSearchPF(driver);

       // FlightS.setOneWay();
        FlightS.setFlyFrom();
        FlightS.setFlyTo();

        Thread.sleep(1000);

        FlightS.setGetFlyTo();
        FlightS.setDepDate();
        FlightS.setGetDepDate();
        FlightS.setRetDate();
        FlightS.setGetRetDate();
        FlightS.setAdult();
        FlightS.setChild();
        FlightS.setInfant();
        FlightS.setAirLine();
        FlightS.setCabinClass();
        FlightS.setFlex();
        FlightS.setNonStop();

        Thread.sleep(2000);

        FlightS.setSearchButton();

    }
}
