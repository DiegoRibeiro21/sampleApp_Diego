$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "acessar a pagina e realizar o preenchimento dos campos",
  "description": "",
  "id": "acessar-a-pagina-e-realizar-o-preenchimento-dos-campos",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@cadastro"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que o usuario esteja na tela de undefined Insurance",
  "keyword": "Dado "
});
formatter.match({
  "location": "cadastroSteps.queOUsuarioEstejaNaTelaDeUndefinedInsurance()"
});
formatter.result({
  "duration": 6442555100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "realizar cadastro na tela de undefined Insurance",
  "description": "",
  "id": "acessar-a-pagina-e-realizar-o-preenchimento-dos-campos;realizar-cadastro-na-tela-de-undefined-insurance",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "digitar os campos obrigatorios do formulario Enter Vehicle Data",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "clicar em next",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "preencher os campos do formulario Enter Insurant Data",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "preencher os campos do formulario Enter Product Data",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "preencher os campos do formulario Select Price Option",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "sera apresentado a mensagem “Sending e-mail success!” na tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "cadastroSteps.digitarOsCamposObrigatoriosDoFormularioEnterVehicleData()"
});
formatter.result({
  "duration": 1184638200,
  "status": "passed"
});
formatter.match({
  "location": "cadastroSteps.clicarEmNext()"
});
formatter.result({
  "duration": 67646500,
  "status": "passed"
});
formatter.match({
  "location": "cadastroSteps.preencherOsCamposDoFormularioEnterInsurantData()"
});
formatter.result({
  "duration": 969045200,
  "status": "passed"
});
formatter.match({
  "location": "cadastroSteps.preencherOsCamposDoFormularioEnterProductData()"
});
formatter.result({
  "duration": 368147500,
  "status": "passed"
});
formatter.match({
  "location": "cadastroSteps.preencherOsCamposDoFormularioSelectPriceOption()"
});
formatter.result({
  "duration": 494778000,
  "status": "passed"
});
formatter.match({
  "location": "cadastroSteps.seraApresentadoAMensagemSendingEMailSuccessNaTela()"
});
formatter.result({
  "duration": 9416550300,
  "status": "passed"
});
});