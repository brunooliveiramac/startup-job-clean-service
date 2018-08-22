#language: pt
#encoding: utf-8

@JobDetail
Funcionalidade: Detalhamento da vaga

  Contexto:
    Dado que eu esteja logado

  Cenario: Usuario visualiza detalhe da vaga de Dev com acrescimo de 10%
    E visualizo a vaga de Dev
    Entao vejo um acrescimo de 10% no salario
