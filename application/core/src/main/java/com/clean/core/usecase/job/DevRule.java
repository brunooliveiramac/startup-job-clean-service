package com.clean.core.usecase.job;

import com.clean.core.entity.JobTypeDomain;

public class DevRule implements JobRule{

    @Override
    public boolean match(JobTypeDomain jobTypeDomain) {
        return jobTypeDomain == JobTypeDomain.DEV;
    }

    @Override
    public double calculate(double value) {
        return value * 0.10;
    }
}
