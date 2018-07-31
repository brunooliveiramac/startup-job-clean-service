package com.clean.configuration;

import com.clean.core.dataproviders.database.job.JobDatabaseDataProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class DatabaseDataProviderConfiguration {

    @Bean
    public JobDatabaseDataProvider jobDatabaseDataProvider(EntityManager entityManager) {
        return new JobDatabaseDataProvider(entityManager);
    }

}
