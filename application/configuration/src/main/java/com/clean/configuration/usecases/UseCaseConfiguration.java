package com.clean.configuration.usecases;


import com.clean.core.usecase.job.JobDetail;
import com.clean.core.usecase.job.ObtainJobOpportunitiesUseCase;
import com.clean.core.usecase.job.ObtainJobs;
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
