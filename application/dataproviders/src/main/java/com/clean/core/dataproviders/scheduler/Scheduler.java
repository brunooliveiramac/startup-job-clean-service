package com.clean.core.dataproviders.scheduler;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "scheduler-microservice")
public interface Scheduler {

    @RequestMapping(method = RequestMethod.POST, value = "/schedule")
    void schedule();
}
