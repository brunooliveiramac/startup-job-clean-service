package acceptance.support;

import com.clean.core.entity.JobDomain;
import com.clean.core.entity.JobTypeDomain;
import com.clean.core.usecase.job.ObtainJobDetail;
import com.clean.core.usecase.job.ObtainJobDetailUseCase;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class JobDetailsSupport {

    private ObtainJobDetailUseCase obtainJobDetailUseCase;

    private ObtainJobDetail obtainJobDetail = Mockito.mock(ObtainJobDetail.class);

    public void shouldReturnDetails() {
        obtainJobDetailUseCase = new ObtainJobDetailUseCase(obtainJobDetail);
        JobDomain jobDomain = JobDomain.Builder.create().type(JobTypeDomain.DEV).build();
        when(obtainJobDetail.byId(1)).thenReturn(jobDomain);
        JobDomain detail = this.obtainJobDetailUseCase.detail(1);
        verify(this.obtainJobDetail, times(1)).byId(1);
    }
}
