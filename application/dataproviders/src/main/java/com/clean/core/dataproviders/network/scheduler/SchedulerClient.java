package com.clean.core.dataproviders.network.scheduler;

import com.clean.core.usecase.scheduler.ScheduleInterview;

public class SchedulerClient implements ScheduleInterview {

    private Scheduler scheduler;

    public SchedulerClient(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    @Override
    public void scheduleInterview() {
        scheduler.schedule();
    }
}
