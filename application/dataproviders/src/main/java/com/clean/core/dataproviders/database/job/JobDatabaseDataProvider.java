package com.clean.core.dataproviders.database.job;

import com.clean.core.entity.Job;
import com.clean.core.usecase.jobservice.ObtainJobs;

import javax.persistence.EntityManager;
import java.util.List;

public class JobDatabaseDataProvider implements ObtainJobs {

    private EntityManager manager;

    public JobDatabaseDataProvider(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Job> obtainJobs() {
        return manager.createQuery("SELECT job FROM Job job ").getResultList();
    }
}
