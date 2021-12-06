package page;

import org.openqa.selenium.By;
import support.Web;
import java.util.concurrent.TimeUnit;
import static support.Web.navegador;

public class enterVehicleDataPage extends Web {
    private By selectedinsurance = By.xpath("//span[@id='selectedinsurance']");
    private By entervehicledata = By.xpath("//a[@id='entervehicledata']");
    private By make = By.cssSelector("#make");
    private By audi = By.xpath("//option[.='Audi']");
    private By model = By.cssSelector("#model");
    private By scooter = By.xpath("//option[.='Scooter']");
    private By cylindercapacity = By.cssSelector("#cylindercapacity");
    private By engineperformance = By.cssSelector("#engineperformance");
    private By dateofmanufacture = By.cssSelector("#dateofmanufacture");
    private By numberofseats = By.cssSelector("#numberofseats");
    private By number1 = By.cssSelector("#numberofseats > [value='1']");
    private By yes = By.cssSelector(".idealsteps-wrap div:nth-of-type(7) label:nth-of-type(1) > .ideal-radio");

    private By numberofseatsmotorcycle = By.cssSelector("#numberofseatsmotorcycle");
    private By number2 = By.cssSelector("#numberofseatsmotorcycle > [value='1']");
    private By fuel = By.cssSelector("#fuel");
    private By petrol = By.cssSelector("[value='Petrol']");
    private By payload = By.cssSelector("#payload");
    private By totalweight = By.cssSelector("#totalweight");
    private By listprice = By.cssSelector("#listprice");
    private By licenseplatenumber = By.cssSelector("#licenseplatenumber");
    private By annualmileage = By.cssSelector("#annualmileage");
    private By nextenterinsurantdata = By.cssSelector("#nextenterinsurantdata");


public void setMake(){
    navegador.findElement(make).click();
    navegador.findElement(audi).click();
}
public void setmodel(){
        navegador.findElement(model).click();
        navegador.findElement(scooter).click();
    }
public void setcylindercapacity(String _texto){
        navegador.findElement(cylindercapacity).sendKeys(_texto);

    }
public void setengineperformance(String _texto){
        navegador.findElement(engineperformance).sendKeys(_texto);

    }
public void setdateofmanufacture(String _texto){
        navegador.findElement(dateofmanufacture).sendKeys(_texto);

    }
public void setnumberofseats(){
        navegador.findElement(numberofseats).click();
        navegador.findElement(number1).click();

    }
public void setyes(){
        navegador.findElement(yes).click();


    }
public void setnumberofseatsmotorcycle(){
        navegador.findElement(numberofseatsmotorcycle).click();
         navegador.findElement(number2).click();

}
public void setpetrol(){
        navegador.findElement(fuel).click();
        navegador.findElement(petrol).click();

    }
public void setpayload(String _texto){
        navegador.findElement(payload).sendKeys(_texto);

    }
public void settotalweight(String _texto){
        navegador.findElement(totalweight).sendKeys(_texto);

    }
public void setlistprice(String _texto){
        navegador.findElement(listprice).sendKeys(_texto);

    }
public void setlicenseplatenumber(String _texto){
        navegador.findElement(licenseplatenumber).sendKeys(_texto);

    }
public void setannualmileage(String _texto){
        navegador.findElement(annualmileage).sendKeys(_texto);

    }
public void setnextenterinsurantdata(){
        navegador.findElement(nextenterinsurantdata).click();


    }



}
