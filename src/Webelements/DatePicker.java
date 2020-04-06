package Webelements;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class DatePicker {

    public static WebDriver driver;

    @BeforeClass
    public static void BeforeTest(){
        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
    }
    @Before
    public void BeforeMethod(){
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void DatePickerTest() throws ParseException, InterruptedException {


       driver.findElement(By.id("datepicker")).click();

       String setDateStr = "15/12/2020"; //Date format : ddmmyyyy

       String currentDateStr =  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
       // Date format : mmmm yyyy

        Date setDate = new SimpleDateFormat("dd/mm/yyyy").parse(setDateStr);
        Date currentDate = new SimpleDateFormat("mmmm yyyy").parse(currentDateStr);

        int monthDiff = Months.monthsBetween(new DateTime(currentDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1)).getMonths();

        boolean isFuture = true;
        if(monthDiff < 0){
            isFuture = false;
            monthDiff = -1 * monthDiff;
        }
        for(int i=0; i<monthDiff; i++){
            if(isFuture)
                driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
                else
                driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();

        }

        String day;
        day = new SimpleDateFormat("dd").format(setDate);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();

    }



}
