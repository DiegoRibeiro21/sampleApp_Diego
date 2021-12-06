package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Web;

import java.io.File;

import static support.Web.navegador;


public class EnterInsurantDataPage {
    private By firstname = By.xpath("//input[@id='firstname']");
    private By lastname = By.id("lastname");
    private By dateofbirth2 = By.xpath("//input[@id='birthdate']");
    private By gender = By.xpath("//label[contains(.,'Male')]");
    private By streetaddress = By.xpath("//input[@id='streetaddress']");
    private By country = By.cssSelector("[value='Brazil']");
    private By zipcode = By.xpath("//input[@id='zipcode']");
    private By city = By.xpath("//input[@id='city']");
    private By occupation = By.xpath("//option[.='Public Official']");
    private By hobbies = By.xpath("//section[2]//label[1]/span[@class='ideal-check']");
    private By website = By.xpath("//input[@id='website']");
    private By picture = By.xpath("//input[@id='picture']");
    private By next = By.xpath("//button[@id='nextenterproductdata']");




public void setfirstname(String _texto){
        navegador.findElement(firstname).sendKeys(_texto);

    }
public void setlastname(String _texto){
        navegador.findElement(lastname).sendKeys(_texto);

    }
public void setdateofbirth2(String _texto){
        navegador.findElement(dateofbirth2).sendKeys(_texto);

    }
public void setgender(){
        navegador.findElement(gender).click();

    }
public void setstreetaddress(String _texto){
        navegador.findElement(streetaddress).sendKeys(_texto);

    }
public void setcountry(){
        navegador.findElement(country).click();

    }
public void setzipcode(String _texto){
        navegador.findElement(zipcode).sendKeys(_texto);

    }
public void setcity(String _texto){
        navegador.findElement(city).sendKeys(_texto);

    }
public void setoccupation(){
        navegador.findElement(occupation).click();

    }
public void sethobbies(){
        navegador.findElement(hobbies).click();

    }
public void setwebsite(String _texto){
        navegador.findElement(website).sendKeys(_texto);

    }

    public void setUpLoad(String file) {
        WebElement element = navegador.findElement(picture);
        String path = System.getProperty("user.dir") + "src/test/java/resources/file/".replace("/", File.separator) + file;
        element.sendKeys(path);
    }
public void setnext(){
        navegador.findElement(next).click();

    }












}
