package com.clean.configuration.toggle;

import lombok.Getter;

@Getter
public enum Features {

    OBTAIN_AVAILABILITY(
            "obtain-availability",
            "getDescription",
            false);

    private final String key;
    private final String description;
    private final boolean defaultValue;

    Features(final String key, final String description, final boolean defaultValue) {
        this.key = key;
        this.description = description;
        this.defaultValue = defaultValue;
    }
}
