package com.clean.core.gateway.ff4j;

public enum Features {

    SCHEDULER(
            "scheduler",
            "scheduler user for interview",
            false);

    private final String key;
    private final String description;
    private final boolean defaultValue;

    Features(final String key, final String description, final boolean defaultValue) {
        this.key = key;
        this.description = description;
        this.defaultValue = defaultValue;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDefaultValue() {
        return defaultValue;
    }
}
