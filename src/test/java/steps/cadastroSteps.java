package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import page.*;
import support.Web;


import java.util.concurrent.TimeUnit;

public class cadastroSteps {

    private enterVehicleDataPage enterVehicleData;
    private EnterInsurantDataPage EnterInsurantData;
    private enterproductdataPage enterproductdata;
    private selectPriceOptionPage princeOptionPage;
    private sendQuotePage sendQuote;


    public cadastroSteps() {
        this.enterVehicleData = new enterVehicleDataPage();
        this.EnterInsurantData = new EnterInsurantDataPage();
        this.enterproductdata = new enterproductdataPage();
        this.princeOptionPage = new selectPriceOptionPage();
        this.sendQuote = new sendQuotePage();


    }


    @Dado("^que o usuario esteja na tela de undefined Insurance$")
    public void queOUsuarioEstejaNaTelaDeUndefinedInsurance() throws Throwable {
        enterVehicleData.Init();

    }

    @Quando("^digitar os campos obrigatorios do formulario Enter Vehicle Data$")
    public void digitarOsCamposObrigatoriosDoFormularioEnterVehicleData() throws Throwable {
        enterVehicleData.setMake();
        enterVehicleData.setmodel();
        enterVehicleData.setcylindercapacity("50");
        enterVehicleData.setengineperformance("100");
        enterVehicleData.setdateofmanufacture("12/01/2021");
        enterVehicleData.setnumberofseats();
        enterVehicleData.setyes();
        enterVehicleData.setnumberofseatsmotorcycle();
        enterVehicleData.setpetrol();
        enterVehicleData.setpayload("120");
        enterVehicleData.settotalweight("100");
        enterVehicleData.setlistprice("1000");
        enterVehicleData.setlicenseplatenumber("524998754");
        enterVehicleData.setannualmileage("12500");


    }

    @Quando("^clicar em next$")
    public void clicarEmNext() throws Throwable {
        enterVehicleData.setnextenterinsurantdata();

    }

    @Quando("^preencher os campos do formulario Enter Insurant Data$")
    public void preencherOsCamposDoFormularioEnterInsurantData() throws Throwable {
        EnterInsurantData.setfirstname("Diego");
        EnterInsurantData.setlastname("Ribeiro");
        EnterInsurantData.setdateofbirth2("01/01/1980");
        EnterInsurantData.setgender();
        EnterInsurantData.setstreetaddress("Rua Pompeu Ferreira da Ponte, 308");
        EnterInsurantData.setcountry();
        EnterInsurantData.setzipcode("61910120");
        EnterInsurantData.setcity("Fortaleza");
        EnterInsurantData.setoccupation();
        EnterInsurantData.sethobbies();
        EnterInsurantData.setwebsite("www.meusite.com.br");
        EnterInsurantData.setUpLoad("Accenture.png");
        EnterInsurantData.setnext();


    }

    @Quando("^preencher os campos do formulario Enter Product Data$")
    public void preencherOsCamposDoFormularioEnterProductData() throws Throwable {

        enterproductdata.setstartdate2("01/01/2026");
        enterproductdata.setinsurancesum();
        enterproductdata.setmeritrating();
        enterproductdata.setdamageinsurance();
        enterproductdata.setoptionalproducts();
        enterproductdata.setcourtesycar();
        enterproductdata.setnextenter();

    }

    @Quando("^preencher os campos do formulario Select Price Option$")
    public void preencherOsCamposDoFormularioSelectPriceOption() throws Throwable {

        princeOptionPage.setUltimatebutton();
        princeOptionPage.setnext3();


    }

    @Entao("^sera apresentado a mensagem “Sending e-mail success!” na tela$")
    public void seraApresentadoAMensagemSendingEMailSuccessNaTela() throws Throwable {

        sendQuote.setemailquote("diegomays21@gmail.com");
        sendQuote.setphonequote("85998545715");
        sendQuote.setusernamequote("Diego.Ribeiro");
        sendQuote.setpasswordquote("Xyz@123");
        sendQuote.setconfirmpassword("Xyz@123");
        sendQuote.setcommentsquote("Fico no aguardo de um retorno e desde já agradeço a atenção.");
        sendQuote.setsendquote();
        sendQuote.setconfirmacaodesucesso();

    }

}
