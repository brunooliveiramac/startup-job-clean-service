package com.clean.core.usecase.job;

import com.clean.core.entity.JobDomain;

public interface JobDetail {

    JobDomain byId(Integer id);

}
