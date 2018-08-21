package com.clean.core.usecase.job;

import com.clean.core.entity.JobDomain;

public interface ObtainJobDetail {

    JobDomain byId(Integer id);

}
