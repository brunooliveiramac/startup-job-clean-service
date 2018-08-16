package com.clean.core.gateway.ff4j;

public class FeatureToggleGateway{

    private IsFeatureEnabled featureToggle;

    public FeatureToggleGateway(IsFeatureEnabled featureToggle) {
        this.featureToggle = featureToggle;
    }

    public boolean isFeatureEnable(Features features) {
        return featureToggle.isFeatureEnable(features);
    }
}
