package endtoend.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import endtoend.ApplicationContext;
import endtoend.support.JourneySupport;

public class JourneySteps extends ApplicationContext {

    @Quando("^Eu realizo o login na aplicacao$")
    public void eu_realizo_o_login_na_aplicacao() throws Throwable {
    }

    @Quando("^Visualizo as vagas disponiveis$")
    public void visualizo_as_vagas_disponiveis() throws Throwable {
        JourneySupport.instance().search();
    }

    @Quando("^Escolho uma das vagas$")
    public void escolho_uma_das_vagas() throws Throwable {
    }

    @Quando("^E vejo os detalhes da vaga$")
    public void e_vejo_os_detalhes_da_vaga() throws Throwable {
        JourneySupport.instance().seeDetail();
    }

    @Entao("^Eu me inscrevo na vaga$")
    public void eu_me_inscrevo_na_vaga() throws Throwable {
        JourneySupport.instance().enroll();
    }

}
