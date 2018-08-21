package com.clean.core.usecase.ff4j;

public class FeatureToggle {

    private IsFeatureEnabled featureToggle;

    public FeatureToggle(IsFeatureEnabled featureToggle) {
        this.featureToggle = featureToggle;
    }

    public boolean isFeatureEnable(Features features) {
        return featureToggle.isFeatureEnable(features);
    }
}
