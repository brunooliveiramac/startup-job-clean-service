package com.clean.core.job.obtainjobs;


import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.job.ObtainAllJobs;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ObtainAllJobsUseCaseTest {

    ObtainAllJobs obtainAllJobs = mock(ObtainAllJobs.class);

    @Test
    public void shouldReturnAllJobs() {
        List<JobDomain> jobDomains = givenJobsFound();
        assertEquals(3, jobDomains.size());
    }

    private List<JobDomain> givenJobsFound() {
        List<JobDomain> expectedDomains = Arrays.asList(new JobDomain(), new JobDomain(), new JobDomain());
        when(obtainAllJobs.obtainJobs()).thenReturn(expectedDomains);
        return expectedDomains;
    }

}
