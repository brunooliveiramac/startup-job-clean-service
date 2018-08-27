#language: pt
#encoding: utf-8

@JobDetails
Funcionalidade: Obter Detalhes Da Vaga

  Contexto:
    Dado que eu esteja na tela de visualizacao da lista de vagas

  Cenario: Usuario acessa a vaga especificada e visualiza seus detalhes
    Quando Quando eu clicar sobre uma vaga
    Entao Eu devo ser direcionado para a tela contendo seus detalhes
