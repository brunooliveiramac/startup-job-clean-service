$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("acceptance/features/Journey.feature");
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
  "name": "Realizar o fluxo de cadastro na vaga",
  "description": "",
  "id": "realizar-o-fluxo-de-cadastro-na-vaga",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@JornadaDeCadastro"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Jornado de cadastro na vaga de QA",
  "description": "",
  "id": "realizar-o-fluxo-de-cadastro-na-vaga;jornado-de-cadastro-na-vaga-de-qa",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 8,
  "name": "Eu realizo o login na aplicacao",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "Visualizo as vagas disponiveis",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "Escolho uma das vagas",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "E vejo os detalhes da vaga",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "Eu me inscrevo na vaga",
  "keyword": "Entao "
});
formatter.match({
  "location": "JourneySteps.eu_realizo_o_login_na_aplicacao()"
});
formatter.result({
  "duration": 215970618,
  "status": "passed"
});
formatter.match({
  "location": "JourneySteps.visualizo_as_vagas_disponiveis()"
});
formatter.result({
  "duration": 2329572764,
  "status": "passed"
});
formatter.match({
  "location": "JourneySteps.escolho_uma_das_vagas()"
});
formatter.result({
  "duration": 66626,
  "status": "passed"
});
formatter.match({
  "location": "JourneySteps.e_vejo_os_detalhes_da_vaga()"
});
formatter.result({
  "duration": 96169519,
  "status": "passed"
});
formatter.match({
  "location": "JourneySteps.eu_me_inscrevo_na_vaga()"
});
formatter.result({
  "duration": 642444065,
  "status": "passed"
});
});