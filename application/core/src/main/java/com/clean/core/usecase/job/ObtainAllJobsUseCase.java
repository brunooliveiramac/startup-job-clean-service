package com.clean.core.usecase.job;

import com.clean.core.entity.JobDomain;

import java.util.List;

//Inverter a dependência faz com que um cliente não fique frágil a mudanças relacionadas a detalhes de implementação.
public class ObtainAllJobsUseCase {

    private final ObtainAllJobs obtainJobs;
    private final ObtainJobDetail jobDetail;


    public ObtainAllJobsUseCase(ObtainAllJobs obtainJobs,
                                ObtainJobDetail jobDetail) {
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
