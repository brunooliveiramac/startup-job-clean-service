package com.clean.core.usecase.job;

import com.clean.core.entity.JobDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ObtainJobDetailUseCase {

    private ObtainJobDetail obtainJobDetail;

    public ObtainJobDetailUseCase(ObtainJobDetail obtainJobDetail) {
        this.obtainJobDetail = obtainJobDetail;
    }

    public JobDomain detail (Integer id) {
        JobDomain jobDomain = this.obtainJobDetail.byId(id);
        List<JobRule> regras = Arrays.asList(new QARule(),new ManagerRule(), new DevRule());

        Optional<JobRule> any = regras.stream()
                .filter(regra -> regra.match(jobDomain.getJobTypeDomain()))
                .findAny();

        if (any.isPresent()) {
            JobRule jobRule = any.get();
            jobDomain.salary(jobRule.calculate(jobDomain.salary()));
        }

        return jobDomain;
    }
}
