#language: pt
#encoding: utf-8

@Job
Funcionalidade: Job

  Contexto:
    Dado que isso funcione

  Esquema do Cenario: Operador realiza o cadastro da ordem de serviço manualmente e verifica os status dela
    E que eu preencho todos os dados do paciente <PACIENTE>
    Exemplos:
      | PACIENTE      |
      | Frodo Baggins |

