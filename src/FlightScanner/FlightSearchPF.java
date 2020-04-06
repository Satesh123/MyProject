package FlightScanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightSearchPF {   //IN Page Object Model used page factory
    WebDriver driver;

    public FlightSearchPF(WebDriver driver) { //Create constructor
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
 //Used @FindBy annotation for Page Factory.
    @FindBy(id = "OneWay")
    WebElement OneWay;
    @FindBy(id = "FDestFrom")
    WebElement FlyFrom;
    @FindBy(id = "FDestTo")
    WebElement FlyTo;
    @FindBy(xpath = "/html/body/div[4]/ul/li")
    WebElement getFlyTo;
    @FindBy(id = "FDptDateDDMMYY")
    WebElement DepDate;
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[5]/a")
    WebElement getDepDate;
    @FindBy(id = "FRetDateDDMMYY")
    WebElement RetDate;
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[5]/a")
    WebElement getRetDate;
    @FindBy(id = "FAdult")
    WebElement Adult;
    @FindBy(id = "FChild")
    WebElement Child;
    @FindBy(id = "FInfant")
    WebElement Infant;
    @FindBy(id = "FAirLine")
    WebElement AirLine;
    @FindBy(id = "FClsType")
    WebElement CabinClass;
    @FindBy(id = "FlexID")
    WebElement Flex;
    @FindBy(id = "FNonStop")
    WebElement NonStop;
    @FindBy(id = "imgSearch12")
    WebElement SearchButton;

    public void setOneWay() {
        OneWay.click();
    }

    public void setFlyFrom() {
        Select flyfrom = new Select(FlyFrom);
        flyfrom.selectByIndex(1);
    }

    public void setFlyTo() {
        FlyTo.sendKeys("Mum");
    }
    public void setGetFlyTo(){
        getFlyTo.click();
    }

    public void setDepDate() {
        DepDate.click();
    }
    public void setGetDepDate(){
        getDepDate.click();
    }

    public void setRetDate() {
        RetDate.click();
    }
    public void setGetRetDate(){
        getRetDate.click();

    }

    public void setAdult() {
        Select adult = new Select(Adult);
        adult.selectByIndex(1);
    }

    public void setChild() {
        Select child = new Select(Child);
        child.selectByIndex(1);
    }

    public void setInfant() {
        Select infant = new Select(Infant);
        infant.selectByIndex(0);
    }
    public void setAirLine(){
        Select airline = new Select(AirLine);
        airline.selectByIndex(8);
    }
    public void setCabinClass(){
        Select cabin = new Select(CabinClass);
        cabin.selectByIndex(1);
    }
    public void setFlex(){
        Flex.click();
    }
    public void setNonStop(){
        NonStop.click();
    }
    public void setSearchButton(){
        SearchButton.click();
    }



}
