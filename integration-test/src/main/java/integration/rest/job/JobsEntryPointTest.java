package integration.rest.job;

import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.job.ObtainJobOpportunitiesUseCase;
import integration.rest.ApplicationContext;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class JobsEntryPointTest extends ApplicationContext {

    private ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase;

    @Test
    public void shouldReturnStatusOkWhenSearchForJobs() throws Exception {
        obtainJobOpportunitiesUseCase = Mockito.mock(ObtainJobOpportunitiesUseCase.class);
        when(obtainJobOpportunitiesUseCase.obtainJobOpportunities())
                .thenReturn(Arrays.asList(new JobDomain()));
        performGet();
    }

    public void shouldNotScheduleJobInterviewWhenToggleIsDisable(){

    }

    private MvcResult performGet() throws Exception {
       return mock.perform(MockMvcRequestBuilders.get("/jobs")
                .contentType(MediaType.APPLICATION_XML_VALUE))
                .andExpect(status().is(200))
                .andReturn();
    }
}
