package com.clean.core.dataproviders.database.job;

import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.jobservice.ObtainJobs;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

public class JobDatabaseDataProvider implements ObtainJobs {

    private EntityManager manager;

    public JobDatabaseDataProvider(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<JobDomain> obtainJobs() {
        return toDomain(manager.createQuery("SELECT job FROM Job job ").getResultList());
    }

    private List<JobDomain> toDomain(List<Job> jobs) {
        return jobs.stream().map(job -> toDomain(job)).collect(Collectors.toList());
    }

    private JobDomain toDomain(Job job){
        return JobDomain.Builder.create().desciption(job.description()).build();
    }




}
