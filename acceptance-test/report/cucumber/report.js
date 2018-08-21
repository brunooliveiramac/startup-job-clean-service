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
  "name": "Job",
  "description": "",
  "id": "job",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@Job"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Operador realiza o cadastro da ordem de serviço manualmente e verifica os status dela",
  "description": "",
  "id": "job;operador-realiza-o-cadastro-da-ordem-de-serviço-manualmente-e-verifica-os-status-dela",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 11,
  "name": "que eu preencho todos os dados do paciente \u003cPACIENTE\u003e",
  "keyword": "E "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "job;operador-realiza-o-cadastro-da-ordem-de-serviço-manualmente-e-verifica-os-status-dela;",
  "rows": [
    {
      "cells": [
        "PACIENTE"
      ],
      "line": 13,
      "id": "job;operador-realiza-o-cadastro-da-ordem-de-serviço-manualmente-e-verifica-os-status-dela;;1"
    },
    {
      "cells": [
        "Frodo Baggins"
      ],
      "line": 14,
      "id": "job;operador-realiza-o-cadastro-da-ordem-de-serviço-manualmente-e-verifica-os-status-dela;;2"
    }
  ],
  "keyword": "Exemplos"
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
  "name": "que isso funcione",
  "keyword": "Dado "
});
formatter.match({
  "location": "JobSteps.que_isso_funcione()"
});
formatter.result({
  "duration": 556353067,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Operador realiza o cadastro da ordem de serviço manualmente e verifica os status dela",
  "description": "",
  "id": "job;operador-realiza-o-cadastro-da-ordem-de-serviço-manualmente-e-verifica-os-status-dela;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@Job"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que eu preencho todos os dados do paciente Frodo Baggins",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.match({
  "location": "JobSteps.que_eu_preencho_todos_os_dados_do_paciente_Frodo_Baggins()"
});
formatter.result({
  "duration": 49933,
  "status": "passed"
});
});