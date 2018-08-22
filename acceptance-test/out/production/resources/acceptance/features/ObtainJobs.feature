#language: pt
#encoding: utf-8

@AllJobs
Funcionalidade: Listagem de vagas

  Contexto:
    Dado que eu esteja logado

  Cenario: Usuario vizualiza vagas retornadas ao carregar pagina
    E carrego a pagina de vagas
    Entao as vagas são retornadas
