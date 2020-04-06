package FlightScanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightSearchPOM {

   WebDriver driver;

   public FlightSearchPOM(WebDriver driver){
       this.driver = driver;
   }

   By OneWay = By.id("OneWay");
   By FlyFrom = By.id("FDestFrom");
   By FlyTo = By.id("FDestTo");
   By DepDate = By.id("FDptDateDDMMYY");
   By RetDate = By.id("FRetDateDDMMYY");
   By Adult = By.id("FAdult");
   By Child = By.id("FChild");
   By Infant = By.id("FInfant");
   By AirLine = By.id("FAirLine");
   By CabinClass = By.id("FClsType");
   By FlexSearch = By.id("FlexID");
   By NonStopF = By.id("FNonStop");
   By SearchButton = By.id("imgSearch12");

   public void OneWay(){ driver.findElement(OneWay).click();}
   public void FlyFrom(){
       Select DepCity = new Select(driver.findElement(FlyFrom));
       DepCity.selectByIndex(1);
       }
   public void FlyTo(){driver.findElement(FlyTo).sendKeys("Ahmedabad");}
   public void DepDate(){driver.findElement(DepDate).click();}
    public void RetDate(){driver.findElement(RetDate).click();}
    public void Adult(){
       Select adultno = new Select(driver.findElement(Adult));
       adultno.selectByIndex(1);
       }
       public void Child(){
       Select childno = new Select(driver.findElement(Child));
       childno.selectByIndex(0);
       }
       public void Infant(){
       Select infantno = new Select(driver.findElement(Infant));
       infantno.selectByIndex(0);
       }
       public void AirLine(){
       Select selectAirline = new Select(driver.findElement(AirLine));
       selectAirline.selectByIndex(0);
       }
       public void CabinClass(){
      Select cabin = new Select(driver.findElement(CabinClass));
      cabin.selectByIndex(1);
       }
       public void FlexSearch(){driver.findElement(FlexSearch).click();}
       public void NonStopF(){driver.findElement(NonStopF).click();}
       public void SearchButton(){driver.findElement(SearchButton).click();}



}
