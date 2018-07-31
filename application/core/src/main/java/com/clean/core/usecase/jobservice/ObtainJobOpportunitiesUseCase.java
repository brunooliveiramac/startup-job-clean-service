package com.clean.core.usecase.jobservice;

import com.clean.core.entity.Job;

import java.util.List;

public class ObtainJobOpportunitiesUseCase {

    private final ObtainJobs obtainJobs;

    public ObtainJobOpportunitiesUseCase(ObtainJobs obtainJobs) {
        this.obtainJobs = obtainJobs;
    }

    public List<Job> obtainJobOpportunities() {
        return obtainJobs.obtainJobs();
    }
}
