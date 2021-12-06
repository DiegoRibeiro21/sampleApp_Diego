#language: pt
@cadastro
Funcionalidade: acessar a pagina e realizar o preenchimento dos campos

  Contexto:
    Dado que o usuario esteja na tela de undefined Insurance

   Cenario: realizar cadastro na tela de undefined Insurance
    Quando digitar os campos obrigatorios do formulario Enter Vehicle Data
    E clicar em next
    E preencher os campos do formulario Enter Insurant Data
    E preencher os campos do formulario Enter Product Data
    E preencher os campos do formulario Select Price Option
    Entao sera apresentado a mensagem “Sending e-mail success!” na tela

