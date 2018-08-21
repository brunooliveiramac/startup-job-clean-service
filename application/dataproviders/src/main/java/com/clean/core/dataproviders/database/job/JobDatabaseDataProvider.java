package com.clean.core.dataproviders.database.job;

import com.clean.core.entity.JobDomain;
import com.clean.core.usecase.job.ObtainJobDetail;
import com.clean.core.usecase.job.ObtainAllJobs;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

public class JobDatabaseDataProvider implements ObtainAllJobs, ObtainJobDetail {

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
        return JobDomain.Builder.create()
                .id(job.getId())
                .description(job.getDescription())
                .quantity(job.getQuantity())
                .name(job.getName())
                .company(job.getCompany().getName())
                .local(job.getLocal())
                .build();
    }

    @Override
    public JobDomain byId(Integer id) {
        return toDomain((Job) manager.createQuery("FROM Job j WHERE  j.id =: id")
                .setParameter("id", id).getSingleResult());
    }
}
