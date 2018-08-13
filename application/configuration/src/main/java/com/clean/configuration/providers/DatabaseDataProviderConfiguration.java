package com.clean.configuration.providers;

import com.clean.core.dataproviders.database.job.JobDatabaseDataProvider;
import com.clean.core.dataproviders.scheduler.Scheduler;
import com.clean.core.dataproviders.scheduler.SchedulerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class DatabaseDataProviderConfiguration {

    @Bean
    public JobDatabaseDataProvider jobDatabaseDataProvider(EntityManager entityManager) {
        return new JobDatabaseDataProvider(entityManager);
    }

    @Bean
    public SchedulerClient schedulerClient(Scheduler scheduler){
        return new SchedulerClient(scheduler);
    }



}
