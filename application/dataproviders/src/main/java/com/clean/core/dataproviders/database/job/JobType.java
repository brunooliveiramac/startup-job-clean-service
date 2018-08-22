package com.clean.core.dataproviders.database.job;

public enum JobType {

    QA("Q"),DEV("D"),MANAGER("M");

    private String value;

    JobType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
