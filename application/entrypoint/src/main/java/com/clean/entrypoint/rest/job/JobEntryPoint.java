package com.clean.entrypoint.rest.job;

import com.clean.core.gateway.ff4j.*;
import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.jobservice.ObtainJobOpportunitiesUseCase;
import com.clean.core.usecase.scheduler.ScheduleInterviewUseCase;
import com.clean.entrypoint.rest.job.model.JobModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RibbonClient(name = "scheduler-microservice")
@RestController
public class JobEntryPoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobEntryPoint.class);

    public static final String JOB_PATH = "/jobs";
    public static final String SCHEDULE_PATH = "/schedule";


    private FeatureToggleGateway featureToggleGateway;
    private ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase;
    private ScheduleInterviewUseCase scheduleInterviewUseCase;

    public JobEntryPoint(FeatureToggleGateway featureToggleGateway,
                         ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase,
                         ScheduleInterviewUseCase scheduleInterviewUseCase) {
        this.featureToggleGateway = featureToggleGateway;
        this.obtainJobOpportunitiesUseCase = obtainJobOpportunitiesUseCase;
        this.scheduleInterviewUseCase = scheduleInterviewUseCase;
    }

    @RequestMapping(value = JOB_PATH, method = GET)
    public List<JobModel> getDetails() throws InterruptedException {
        Thread.sleep(5000);
        return toModel(obtainJobOpportunitiesUseCase.obtainJobOpportunities());
    }

    @RequestMapping(value = JOB_PATH + "/{id}", method = GET)
    public JobModel detail(@PathVariable("id") Integer id) {
        return toModel(obtainJobOpportunitiesUseCase.jobDetail(id));
    }

    @HystrixCommand(fallbackMethod = "scheduleFallBack")
    @RequestMapping(value = SCHEDULE_PATH, method = POST)
    public void schedule() {
        System.out.println("Call JOB MicroService");
        if(featureToggleGateway.isFeatureEnable(Features.SCHEDULER)){
            System.out.println("Enabled");
        } else {
            System.out.println("Disabled");
        }
        scheduleInterviewUseCase.scheduleInterview();
    }

    public void scheduleFallBack() {
        System.out.println("Call JOB MicroService FallBack");
    }

    public List<JobModel> toModel(List<JobDomain> jobDomains) {
        return jobDomains.stream().map(jobDomain -> toModel(jobDomain)).collect(Collectors.toList());
    }

    private JobModel toModel(JobDomain jobDomain) {
        return JobModel.Builder.create()
                .id(jobDomain.id())
                .description(jobDomain.description())
                .name(jobDomain.name())
                .quantity(jobDomain.quantity())
                .company(jobDomain.company())
                .local(jobDomain.local())
                .build();
    }
}
