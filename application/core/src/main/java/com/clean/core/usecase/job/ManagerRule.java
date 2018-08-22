package com.clean.core.usecase.job;

import com.clean.core.entity.JobTypeDomain;

public class ManagerRule implements JobRule {

    @Override
    public boolean match(JobTypeDomain jobTypeDomain) {
        return jobTypeDomain == JobTypeDomain.MANAGER;
    }

    @Override
    public double calculate(double value) {
        return value * 0.30;
    }
}
