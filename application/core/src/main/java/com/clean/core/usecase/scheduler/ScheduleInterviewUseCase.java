package com.clean.core.usecase.scheduler;

public class ScheduleInterviewUseCase {

    private ScheduleInterview scheduleInterview;

    public ScheduleInterviewUseCase(ScheduleInterview scheduleInterview) {
        this.scheduleInterview = scheduleInterview;
    }

    public void scheduleInterview() {
        this.scheduleInterview.scheduleInterview();
    }
}
