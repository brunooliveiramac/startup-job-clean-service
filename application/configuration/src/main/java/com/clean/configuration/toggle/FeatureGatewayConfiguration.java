package com.clean.configuration.toggle;

import com.clean.core.usecase.ff4j.FeatureToggle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.clean.core.usecase.ff4j.*;

@Configuration
public class FeatureGatewayConfiguration {

    @Bean
    public FeatureToggle gateway(IsFeatureEnabled featureToggle) {
        return new FeatureToggle(featureToggle);
    }
}
