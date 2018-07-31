package com.clean.configuration;

import com.clean.core.usecase.jobservice.ObtainJobOpportunitiesUseCase;
import com.clean.entrypoint.rest.job.JobEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntryPointConfiguration {

    @Bean
    public JobEntryPoint jobEntrypoint(ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase) {
        return new JobEntryPoint(obtainJobOpportunitiesUseCase);
    }
}
