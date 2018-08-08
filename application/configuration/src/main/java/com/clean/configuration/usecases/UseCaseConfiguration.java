package com.clean.configuration.usecases;


import com.clean.core.usecase.jobservice.ObtainJobOpportunitiesUseCase;
import com.clean.core.usecase.jobservice.ObtainJobs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase(ObtainJobs obtainJobs) {
        return new ObtainJobOpportunitiesUseCase(obtainJobs);
    }

}
