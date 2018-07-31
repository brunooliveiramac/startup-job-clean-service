package com.clean.core.usecase.jobservice;

import com.clean.core.entity.JobDomain;

import java.util.List;

public interface ObtainJobs {

    List<JobDomain> obtainJobs();
}
