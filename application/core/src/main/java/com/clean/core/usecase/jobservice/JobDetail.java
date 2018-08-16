package com.clean.core.usecase.jobservice;

import com.clean.core.entity.JobDomain;

public interface JobDetail {

    JobDomain byId(Integer id);

}
