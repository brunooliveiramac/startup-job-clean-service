package com.clean.configuration.usecases;


import com.clean.core.usecase.jobservice.JobDetail;
import com.clean.core.usecase.jobservice.ObtainJobOpportunitiesUseCase;
import com.clean.core.usecase.jobservice.ObtainJobs;
import com.clean.core.usecase.scheduler.ScheduleInterview;
import com.clean.core.usecase.scheduler.ScheduleInterviewUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase(ObtainJobs obtainJobs, JobDetail jobDetail) {
        return new ObtainJobOpportunitiesUseCase(obtainJobs, jobDetail);
    }

    @Bean
    public ScheduleInterviewUseCase scheduleInterviewUseCase(ScheduleInterview scheduleInterview){
        return new ScheduleInterviewUseCase(scheduleInterview);
    }
}
