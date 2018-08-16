package com.clean.core.usecase.jobservice;

import com.clean.core.entity.JobDomain;

import java.util.List;

public class ObtainJobOpportunitiesUseCase {

    private final ObtainJobs obtainJobs;
    private final JobDetail jobDetail;


    public ObtainJobOpportunitiesUseCase(ObtainJobs obtainJobs,
                                         JobDetail jobDetail) {
        this.obtainJobs = obtainJobs;
        this.jobDetail = jobDetail;
    }

    public List<JobDomain> obtainJobOpportunities() {
        return obtainJobs.obtainJobs();
    }

    public JobDomain jobDetail(Integer id) {
        return jobDetail.byId(id);
    }
}
