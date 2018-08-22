$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("acceptance/features/Job.feature");
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
      "name": "@Job"
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
  "duration": 479675277,
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
  "duration": 16565601,
  "status": "passed"
});
formatter.match({
  "location": "ObtainAllJobsUseCaseSteps.as_vagas_são_retornadas()"
});
formatter.result({
  "duration": 3046716,
  "status": "passed"
});
});