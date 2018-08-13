package com.clean.configuration.entrypoints;

import com.clean.core.usecase.jobservice.ObtainJobOpportunitiesUseCase;
import com.clean.core.usecase.scheduler.ScheduleInterviewUseCase;
import com.clean.entrypoint.rest.job.JobEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntryPointConfiguration {

    @Bean
    public JobEntryPoint jobEntrypoint(ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase,
                                       ScheduleInterviewUseCase scheduleInterviewUseCase) {
        return new JobEntryPoint(obtainJobOpportunitiesUseCase, scheduleInterviewUseCase);
    }
}
