package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import page.EnterInsurantDataPage;
import page.enterVehicleDataPage;
import page.enterproductdataPage;

public class cadastroSteps {

    private enterVehicleDataPage enterVehicleData;
    private EnterInsurantDataPage EnterInsurantData;
    private enterproductdataPage enterproductdata;


    public cadastroSteps() {
        this.enterVehicleData = new enterVehicleDataPage();
        this.EnterInsurantData = new EnterInsurantDataPage();
        this.enterproductdata = new enterproductdataPage();


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
        EnterInsurantData.setdateofbirth2("18/03/1986");
        EnterInsurantData.setgender();
        EnterInsurantData.setstreetaddress("Rua Pompeu Ferreira da Ponte, 308");
        EnterInsurantData.setcountry();
        EnterInsurantData.setzipcode("61910-120");
        EnterInsurantData.setcity("Fortaleza");
        EnterInsurantData.setoccupation();
        EnterInsurantData.sethobbies();
        EnterInsurantData.setwebsite("www.meusite.com.br");
        EnterInsurantData.setUpLoad("Accenture.png");
        EnterInsurantData.setnext();


    }

    @Quando("^preencher os campos do formulario Enter Product Data$")
    public void preencherOsCamposDoFormularioEnterProductData() throws Throwable {

        enterproductdata.setstartdate2("18/03/1986");
        enterproductdata.setinsurancesum();
        enterproductdata.setmeritrating();
        enterproductdata.setdamageinsurance();
        enterproductdata.setoptionalproducts();
        enterproductdata.setcourtesycar();
        enterproductdata.setnextenter();

    }

    @Quando("^preencher os campos do formulario Select Price Option$")
    public void preencherOsCamposDoFormularioSelectPriceOption() throws Throwable {

    }

    @Entao("^sera apresentado a mensagem “Sending e-mail success!” na tela$")
    public void seraApresentadoAMensagemSendingEMailSuccessNaTela() throws Throwable {

    }

}
