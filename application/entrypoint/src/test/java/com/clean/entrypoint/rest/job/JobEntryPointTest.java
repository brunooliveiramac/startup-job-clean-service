package com.clean.entrypoint.rest.job;

import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.ff4j.FeatureToggle;
import com.clean.core.usecase.job.ObtainAllJobsUseCase;
import com.clean.core.usecase.job.ObtainJobDetailUseCase;
import com.clean.core.usecase.scheduler.ScheduleInterviewUseCase;
import com.clean.entrypoint.rest.job.model.JobModel;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JobEntryPointTest {

    ObtainJobDetailUseCase obtainJobDetail = mock(ObtainJobDetailUseCase.class);
    ObtainAllJobsUseCase obtainAllJobsUseCase = mock(ObtainAllJobsUseCase.class);
    FeatureToggle featureToggle = mock(FeatureToggle.class);
    ScheduleInterviewUseCase scheduleInterviewUseCase = mock(ScheduleInterviewUseCase.class);

    JobEntryPoint jobEntryPoint = new JobEntryPoint(featureToggle, obtainAllJobsUseCase, scheduleInterviewUseCase, obtainJobDetail);

    @Test
    public void shouldReturnJobs() {
        givenJobsExists();

        List<JobModel> allJobs = jobEntryPoint.getJobs();

        Assertions.assertThat(allJobs).isNotEmpty();
    }


    private void givenJobsExists() {
        when(obtainAllJobsUseCase.obtainJobOpportunities()).thenReturn(
                Arrays.asList(JobDomain.Builder
                        .create()
                        .id(1)
                        .build())
        );
    }

}
