package com.clean.core.usecase.job;

import com.clean.core.entity.JobDomain;

import java.util.Arrays;
import java.util.List;

//Inverter a dependência faz com que um cliente não fique frágil a mudanças relacionadas a detalhes de implementação.
public class ObtainAllJobsUseCase {

    private final ObtainAllJobs obtainJobs;


    public ObtainAllJobsUseCase(ObtainAllJobs obtainJobs) {
        this.obtainJobs = obtainJobs;
    }

    public List<JobDomain> obtainJobOpportunities() {
        //rules
        return obtainJobs.obtainJobs();
    }

}
