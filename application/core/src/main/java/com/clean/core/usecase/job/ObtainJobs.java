package com.clean.core.usecase.job;

import com.clean.core.entity.JobDomain;

import java.util.List;

public interface ObtainJobs {

    List<JobDomain> obtainJobs();
}
