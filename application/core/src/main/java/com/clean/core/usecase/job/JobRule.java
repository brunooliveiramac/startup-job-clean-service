package com.clean.core.usecase.job;

import com.clean.core.entity.JobTypeDomain;

public interface JobRule {

    boolean match(JobTypeDomain jobTypeDomain);

    double calculate(double value);
}
