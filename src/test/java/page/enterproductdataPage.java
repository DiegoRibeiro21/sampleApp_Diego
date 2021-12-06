package page;

import org.openqa.selenium.By;
import support.Web;

import static support.Web.navegador;

public class enterproductdataPage {

    private By startdate2 = By.xpath("//input[@id='startdate']");
    private By insurancesum = By.xpath("//option[contains(.,'15.000.000,00')]");
    private By meritrating = By.xpath("//option[.='Bonus 1']");
    private By damageinsurance = By.xpath("//option[.='Full Coverage']");
    private By optionalproducts = By.xpath("//section[3]//label[1]/span[@class='ideal-check']");
    private By courtesycar = By.xpath("//select[@id='courtesycar']/option[contains(.,'No')]");
    private By nextenter = By.xpath("//button[@id='nextselectpriceoption']");


public void setstartdate2(String _texto){
        navegador.findElement(startdate2).sendKeys(_texto);

    }
public void setinsurancesum(){
        navegador.findElement(insurancesum).click();

    }
public void setmeritrating(){
        navegador.findElement(meritrating).click();

    }
public void setdamageinsurance(){
        navegador.findElement(damageinsurance).click();

    }
public void setoptionalproducts(){
        navegador.findElement(optionalproducts).click();

    }
public void setcourtesycar(){
        navegador.findElement(courtesycar).click();

    }
public void setnextenter(){
        navegador.findElement(nextenter).click();

    }



}
