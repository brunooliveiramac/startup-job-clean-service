package com.clean.configuration.toggle;

import com.clean.core.usecase.ff4j.Features;
import com.clean.core.usecase.ff4j.IsFeatureEnabled;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class FeatureToggle implements IsFeatureEnabled{

    @Autowired
    public FF4j ff4j;

    @Override
    public boolean isFeatureEnable(Features features) {
        return ff4j.getFeature(features.getKey()).isEnable();
    }
}
