package com.clean.dataprovider.database;

import com.clean.core.dataproviders.database.job.Company;
import com.clean.core.dataproviders.database.job.Job;
import com.clean.core.dataproviders.database.job.JobDatabaseDataProvider;
import com.clean.core.dataproviders.database.job.JobType;
import com.clean.core.entity.JobDomain;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JobDatabaseDataProviderTest {

    EntityManager manager = mock(EntityManager.class);
    Query query = mock(Query.class);

    JobDatabaseDataProvider jobDatabaseDataProvider = new JobDatabaseDataProvider(manager);

    @Test
    public void shouldReturnAllJobs() {
        givenThereAreJobs();

        List<JobDomain> allJobs = jobDatabaseDataProvider.obtainJobs();

        Assertions.assertThat(allJobs).isNotEmpty();
    }

    private void givenThereAreJobs() {
        when(manager.createQuery(anyString())).thenReturn(query);
        when(query.getResultList()).thenReturn(Arrays.asList(
                new Job("Eng", 2, 300, JobType.DEV, new Company("CI&T"))
        ));
    }
}
