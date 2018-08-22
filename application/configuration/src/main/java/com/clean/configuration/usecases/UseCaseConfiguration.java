package com.clean.configuration.usecases;


import com.clean.core.usecase.job.ObtainAllJobs;
import com.clean.core.usecase.job.ObtainAllJobsUseCase;
import com.clean.core.usecase.scheduler.ScheduleInterview;
import com.clean.core.usecase.scheduler.ScheduleInterviewUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public ObtainAllJobsUseCase obtainJobOpportunitiesUseCase(ObtainAllJobs obtainJobs) {
        return new ObtainAllJobsUseCase(obtainJobs);
    }

    @Bean
    public ScheduleInterviewUseCase scheduleInterviewUseCase(ScheduleInterview scheduleInterview){
        return new ScheduleInterviewUseCase(scheduleInterview);
    }
}
