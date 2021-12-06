package page;

import org.openqa.selenium.By;
import support.Web;
import java.util.concurrent.TimeUnit;
import static support.Web.navegador;

public class selectPriceOptionPage {

    private By ultimatebutton = By.xpath("//th[@class='group']/label[4]/span[@class='ideal-radio']");
    private By next3 = By.xpath("//button[@id='nextsendquote']");

public void setUltimatebutton(){
        navegador.findElement(ultimatebutton).click();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
public void setnext3(){
        navegador.findElement(next3).click();


    }
}

