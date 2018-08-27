#language: pt
#encoding: utf-8

@JornadaDeCadastro
Funcionalidade: Realizar o fluxo de cadastro na vaga

  Cenario: Jornado de cadastro na vaga de QA
    Quando Eu realizo o login na aplicacao
    E Visualizo as vagas disponiveis
    E Escolho uma das vagas
    E E vejo os detalhes da vaga
    Entao Eu me inscrevo na vaga
