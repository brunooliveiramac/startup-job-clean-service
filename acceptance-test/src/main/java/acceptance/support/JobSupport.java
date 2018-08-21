package acceptance.support;

import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.job.JobDetail;
import com.clean.core.usecase.job.ObtainJobOpportunitiesUseCase;
import com.clean.core.usecase.job.ObtainJobs;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.ff4j.utils.Util.assertNotNull;
import static org.mockito.Mockito.when;

public class JobSupport {

    private ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase;

    private ObtainJobs obtainJobs;
    private JobDetail jobDetail;

    public void shouldReturnJobs() {
        obtainJobs = Mockito.mock(ObtainJobs.class);
        jobDetail = Mockito.mock(JobDetail.class);

        obtainJobOpportunitiesUseCase = new ObtainJobOpportunitiesUseCase(obtainJobs, jobDetail);

        when(obtainJobs.obtainJobs()).thenReturn(Arrays.asList(new JobDomain()));
        List<JobDomain> jobDomains = obtainJobOpportunitiesUseCase.obtainJobOpportunities();
        assertNotNull(jobDomains);
    }
}
