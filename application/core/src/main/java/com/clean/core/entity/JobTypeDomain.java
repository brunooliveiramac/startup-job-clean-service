package com.clean.core.entity;

public enum JobTypeDomain {

    QA("Q"), DEV("D"), MANAGER("M");

    private String value;

    JobTypeDomain(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static JobTypeDomain getByValue(String value) {
        for (JobTypeDomain type: JobTypeDomain.values()) {
            if (type.value().equalsIgnoreCase(value)) {
                return type;
            }
        }
        return null;
    }
}

