package Automation;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class Datadriven {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Documents\\Logindata.xlsx");
        XSSFWorkbook excelworkbook = new XSSFWorkbook(input);
        Sheet excelsheet = excelworkbook.getSheet("Sheet1");
        int lastrow = excelsheet.getLastRowNum();
        //System.out.println(lastrow);

        setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromeDriver_win32\\chromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.nopcommerce.com/login");

        for (int i = 0; i <= lastrow; i++) {
            Row row = excelsheet.getRow(i);
            int lastcolumn = row.getLastCellNum();
            System.out.println(lastcolumn);

            String email = excelsheet.getRow(i).getCell(0).getStringCellValue();
            driver.findElementById("Email").sendKeys(email);

            String password = excelsheet.getRow(i).getCell(1).getStringCellValue();
            driver.findElementById("Password").sendKeys(password);

            driver.findElementByXPath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input").click();

            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ico-logout")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-logout")));
            driver.findElement(By.className("ico-logout")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-login")));
            driver.findElement(By.className("ico-login")).click();

        }

    }
}
