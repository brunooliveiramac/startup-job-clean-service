package acceptance.steps;

import acceptance.support.JobSupport;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class ObtainAllJobsUseCaseSteps {

    private JobSupport jobSupport;

    public ObtainAllJobsUseCaseSteps(JobSupport jobSupport) {
        this.jobSupport = jobSupport;
    }

    @Dado("^que eu esteja logado$")
    public void que_eu_esteja_logado() {

    }

    @Dado("^carrego a pagina de vagas$")
    public void carrego_a_pagina_de_vagas() {
        jobSupport.whenPerformSearch();
    }

    @Entao("^as vagas são retornadas$")
    public void as_vagas_são_retornadas() {
        jobSupport.shouldReturnJobs();
    }
}
