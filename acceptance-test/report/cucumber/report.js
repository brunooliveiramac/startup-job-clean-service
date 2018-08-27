$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("acceptance/features/ObtainJobDetails.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: utf-8"
    }
  ],
  "line": 5,
  "name": "Obter Detalhes Da Vaga",
  "description": "",
  "id": "obter-detalhes-da-vaga",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@JobDetails"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que eu esteja na tela de visualizacao da lista de vagas",
  "keyword": "Dado "
});
formatter.match({
  "location": "ObtainJobDetailsStep.que_eu_esteja_na_tela_de_visualizacao_da_lista_de_vagas()"
});
formatter.result({
  "duration": 479783576,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Usuario acessa a vaga especificada e visualiza seus detalhes",
  "description": "",
  "id": "obter-detalhes-da-vaga;usuario-acessa-a-vaga-especificada-e-visualiza-seus-detalhes",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 11,
  "name": "Quando eu clicar sobre uma vaga",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "Eu devo ser direcionado para a tela contendo seus detalhes",
  "keyword": "Entao "
});
formatter.match({
  "location": "ObtainJobDetailsStep.quando_eu_clicar_sobre_uma_vaga()"
});
formatter.result({
  "duration": 75944,
  "status": "passed"
});
formatter.match({
  "location": "ObtainJobDetailsStep.eu_devo_ser_direcionado_para_a_tela_contendo_seus_detalhes()"
});
formatter.result({
  "duration": 212462580,
  "status": "passed"
});
formatter.uri("acceptance/features/ObtainJobs.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: utf-8"
    }
  ],
  "line": 5,
  "name": "Listagem de vagas",
  "description": "",
  "id": "listagem-de-vagas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@AllJobs"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que eu esteja logado",
  "keyword": "Dado "
});
formatter.match({
  "location": "ObtainAllJobsUseCaseSteps.que_eu_esteja_logado()"
});
formatter.result({
  "duration": 16337829,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Usuario vizualiza vagas retornadas ao carregar pagina",
  "description": "",
  "id": "listagem-de-vagas;usuario-vizualiza-vagas-retornadas-ao-carregar-pagina",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 11,
  "name": "carrego a pagina de vagas",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "as vagas são retornadas",
  "keyword": "Entao "
});
formatter.match({
  "location": "ObtainAllJobsUseCaseSteps.carrego_a_pagina_de_vagas()"
});
formatter.result({
  "duration": 2943745,
  "status": "passed"
});
formatter.match({
  "location": "ObtainAllJobsUseCaseSteps.as_vagas_são_retornadas()"
});
formatter.result({
  "duration": 2490571,
  "status": "passed"
});
});