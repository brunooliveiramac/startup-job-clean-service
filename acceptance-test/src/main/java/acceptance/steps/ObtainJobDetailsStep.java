package acceptance.steps;

import acceptance.support.JobDetailsSupport;
import cucumber.api.java.en.Then;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
public class ObtainJobDetailsStep {

    private JobDetailsSupport jobDetailsSupport;

    public ObtainJobDetailsStep(JobDetailsSupport jobDetailsSupport) {
        this.jobDetailsSupport = jobDetailsSupport;
    }

    @Dado("^que eu esteja na tela de visualizacao da lista de vagas$")
    public void que_eu_esteja_na_tela_de_visualizacao_da_lista_de_vagas() throws Throwable {

    }

    @Quando("^Quando eu clicar sobre uma vaga$")
    public void quando_eu_clicar_sobre_uma_vaga() throws Throwable {

    }

    @Then("^Eu devo ser direcionado para a tela contendo seus detalhes$")
    public void eu_devo_ser_direcionado_para_a_tela_contendo_seus_detalhes() throws Throwable {
        this.jobDetailsSupport.shouldReturnDetails();
    }
}
