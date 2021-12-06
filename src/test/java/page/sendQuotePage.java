package page;

import org.openqa.selenium.By;
import support.Web;
import java.util.concurrent.TimeUnit;
import static support.Web.navegador;

public class sendQuotePage {

    private By emailquote = By.xpath("//input[@id='email']");
    private By phonequote = By.xpath("//input[@id='phone']");
    private By usernamequote = By.xpath("//input[@id='username']");
    private By passwordquote = By.xpath("//input[@id='password']");
    private By confirmpassword = By.xpath("//input[@id='confirmpassword']");
    private By commentsquote = By.xpath("//textarea[@id='Comments']");
    private By sendquote = By.xpath("//button[@id='sendemail']");
    private By confirmacaodesucesso = By.xpath("//button[@class='confirm']");

    public void setemailquote(String _texto){
        navegador.findElement(emailquote).sendKeys(_texto);

    }
public void setphonequote(String _texto){
        navegador.findElement(phonequote).sendKeys(_texto);

    }
public void setusernamequote(String _texto){
        navegador.findElement(usernamequote).sendKeys(_texto);

    }
public void setpasswordquote(String _texto){
        navegador.findElement(passwordquote).sendKeys(_texto);

    }
public void setconfirmpassword(String _texto){
        navegador.findElement(confirmpassword).sendKeys(_texto);

    }
public void setcommentsquote(String _texto){
        navegador.findElement(commentsquote).sendKeys(_texto);

    }
public void setsendquote(){
        navegador.findElement(sendquote).click();

    navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
public void setconfirmacaodesucesso(){
        navegador.findElement(confirmacaodesucesso).click();

    }
}
