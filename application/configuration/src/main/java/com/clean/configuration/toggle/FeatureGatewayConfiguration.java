package com.clean.configuration.toggle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.clean.core.gateway.ff4j.*;

@Configuration
public class FeatureGatewayConfiguration {

    @Bean
    public FeatureToggleGateway gateway(IsFeatureEnabled featureToggle) {
        return new FeatureToggleGateway(featureToggle);
    }
}
