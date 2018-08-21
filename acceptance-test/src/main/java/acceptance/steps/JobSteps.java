package acceptance.steps;

import acceptance.support.JobSupport;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;

public class JobSteps {

    private JobSupport jobSupport;

    public JobSteps(JobSupport jobSupport) {
        this.jobSupport = jobSupport;
    }

    @Dado("^que isso funcione$")
    public void que_isso_funcione() {
        jobSupport.shouldReturnJobs();
    }

    @E("^que eu preencho todos os dados do paciente Frodo Baggins$")
    public void que_eu_preencho_todos_os_dados_do_paciente_Frodo_Baggins() {

    }
}
