package com.clean.core.usecase.job;

import com.clean.core.entity.JobDomain;

import java.util.List;

//Inverter a dependência faz com que um cliente não fique frágil a mudanças relacionadas a detalhes de implementação.
public class ObtainJobOpportunitiesUseCase {

    private final ObtainJobs obtainJobs;
    private final JobDetail jobDetail;


    public ObtainJobOpportunitiesUseCase(ObtainJobs obtainJobs,
                                         JobDetail jobDetail) {
        this.obtainJobs = obtainJobs;
        this.jobDetail = jobDetail;
    }

    public List<JobDomain> obtainJobOpportunities() {
        //regras
        return obtainJobs.obtainJobs();
    }

    public JobDomain jobDetail(Integer id) {
        return jobDetail.byId(id);
    }
}
