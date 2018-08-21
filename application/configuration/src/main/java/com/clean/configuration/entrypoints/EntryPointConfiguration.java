package com.clean.configuration.entrypoints;
import com.clean.core.usecase.ff4j.*;
import com.clean.core.usecase.job.ObtainAllJobsUseCase;
import com.clean.core.usecase.scheduler.ScheduleInterviewUseCase;
import com.clean.entrypoint.rest.job.JobEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntryPointConfiguration {

    @Bean
    public JobEntryPoint jobEntrypoint(ObtainAllJobsUseCase obtainJobOpportunitiesUseCase,
                                       ScheduleInterviewUseCase scheduleInterviewUseCase,
                                       FeatureToggle featureToggleGateway) {
        return new JobEntryPoint(featureToggleGateway, obtainJobOpportunitiesUseCase, scheduleInterviewUseCase);
    }
}
