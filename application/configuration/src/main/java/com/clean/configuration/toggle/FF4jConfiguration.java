package com.clean.configuration.toggle;



import com.clean.core.usecase.ff4j.*;
import org.apache.commons.lang3.StringUtils;
import org.ff4j.FF4j;
import org.ff4j.core.Feature;
import org.ff4j.redis.RedisConnection;
import org.ff4j.store.EventRepositoryRedis;
import org.ff4j.store.FeatureStoreRedis;
import org.ff4j.store.PropertyStoreRedis;
import org.ff4j.web.FF4jDispatcherServlet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//http://localhost:8080/ff4j-web-console/features

@Configuration
@ConditionalOnClass({FF4j.class})
@ComponentScan(value = {"org.ff4j.spring.boot.web.api", "org.ff4j.services", "org.ff4j.aop", "org.ff4j.spring"})
public class FF4jConfiguration {

    @Bean
    public FF4j getFF4j() {
        FF4j ff4j = new FF4j();

        RedisConnection redisConnection = new RedisConnection("localhost", 6379, "redispass");

        ff4j.setFeatureStore(new FeatureStoreRedis(redisConnection));
        ff4j.setPropertiesStore(new PropertyStoreRedis(redisConnection));
        ff4j.setEventRepository(new EventRepositoryRedis(redisConnection));

        for (Features feature : Features.values()) {
            if (!ff4j.exist(feature.getKey())) {
                ff4j.createFeature(feature.getKey(), feature.isDefaultValue(), feature.getDescription());
            } else {
                Feature storeFeature = ff4j.getFeature(feature.getKey());
                String description = feature.getDescription();
                if (!StringUtils.equals(storeFeature.getDescription(), description)) {
                    storeFeature.setDescription(description);
                    ff4j.getFeatureStore().update(storeFeature);
                }
            }
        }

        return ff4j;
    }

    @Bean
    public FF4jDispatcherServlet getFF4JServlet() {
        FF4jDispatcherServlet ds = new FF4jDispatcherServlet();
        ds.setFf4j(getFF4j());
        return ds;
    }

}
