package acceptance.support;

import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.job.ObtainJobDetail;
import com.clean.core.usecase.job.ObtainAllJobsUseCase;
import com.clean.core.usecase.job.ObtainAllJobs;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.ff4j.utils.Util.assertNotNull;
import static org.mockito.Mockito.when;

public class JobSupport {

    private ObtainAllJobsUseCase obtainJobOpportunitiesUseCase;

    private ObtainAllJobs obtainJobs;
    private ObtainJobDetail jobDetail;

    public void shouldReturnJobs() {
        obtainJobs = Mockito.mock(ObtainAllJobs.class);
        jobDetail = Mockito.mock(ObtainJobDetail.class);

        obtainJobOpportunitiesUseCase = new ObtainAllJobsUseCase(obtainJobs, jobDetail);

        when(obtainJobs.obtainJobs()).thenReturn(Arrays.asList(new JobDomain()));
        List<JobDomain> jobDomains = obtainJobOpportunitiesUseCase.obtainJobOpportunities();
        assertNotNull(jobDomains);
    }
}
