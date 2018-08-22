$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("acceptance/features/ObtainJobDetail.feature");
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
  "name": "Detalhamento da vaga",
  "description": "",
  "id": "detalhamento-da-vaga",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@JobDetail"
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
  "duration": 417608035,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Usuario visualiza detalhe da vaga de Dev com acrescimo de 10%",
  "description": "",
  "id": "detalhamento-da-vaga;usuario-visualiza-detalhe-da-vaga-de-dev-com-acrescimo-de-10%",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 11,
  "name": "visualizo a vaga de Dev",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "vejo um acrescimo de 10% no salario",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "duration": 523030,
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
  "duration": 23539235,
  "status": "passed"
});
formatter.match({
  "location": "ObtainAllJobsUseCaseSteps.as_vagas_são_retornadas()"
});
formatter.result({
  "duration": 2731633,
  "status": "passed"
});
});