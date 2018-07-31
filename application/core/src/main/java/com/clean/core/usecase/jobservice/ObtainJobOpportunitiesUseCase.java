package com.clean.core.usecase.jobservice;

import com.clean.core.entity.JobDomain;

import java.util.List;

public class ObtainJobOpportunitiesUseCase {

    private final ObtainJobs obtainJobs;

    public ObtainJobOpportunitiesUseCase(ObtainJobs obtainJobs) {
        this.obtainJobs = obtainJobs;
    }

    public List<JobDomain> obtainJobOpportunities() {
        return obtainJobs.obtainJobs();
    }
}
