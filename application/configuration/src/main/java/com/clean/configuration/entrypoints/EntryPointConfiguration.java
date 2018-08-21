package com.clean.configuration.entrypoints;
import com.clean.core.gateway.ff4j.*;
import com.clean.core.usecase.job.ObtainJobOpportunitiesUseCase;
import com.clean.core.usecase.scheduler.ScheduleInterviewUseCase;
import com.clean.entrypoint.rest.job.JobEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntryPointConfiguration {

    @Bean
    public JobEntryPoint jobEntrypoint(ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase,
                                       ScheduleInterviewUseCase scheduleInterviewUseCase,
                                       FeatureToggleGateway featureToggleGateway) {
        return new JobEntryPoint(featureToggleGateway, obtainJobOpportunitiesUseCase, scheduleInterviewUseCase);
    }
}
