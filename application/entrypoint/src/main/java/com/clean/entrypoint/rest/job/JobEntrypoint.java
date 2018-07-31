package com.clean.entrypoint.rest.job;


import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.jobservice.ObtainJobOpportunitiesUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class JobEntrypoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobEntrypoint.class);

    public static final String API_PATH = "/jobs";

    private ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase;

    public JobEntrypoint(ObtainJobOpportunitiesUseCase obtainJobOpportunitiesUseCase) {
        this.obtainJobOpportunitiesUseCase = obtainJobOpportunitiesUseCase;
    }

    @RequestMapping(value = API_PATH, method = GET)
    public List<JobDomain> getDetails() {
        return obtainJobOpportunitiesUseCase.obtainJobOpportunities();
    }

}
