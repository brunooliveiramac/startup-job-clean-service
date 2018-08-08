package com.clean.configuration.toggle;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.ff4j.FF4j;
import org.ff4j.core.Feature;
import org.ff4j.redis.RedisConnection;
import org.ff4j.store.EventRepositoryRedis;
import org.ff4j.store.FeatureStoreRedis;
import org.ff4j.store.PropertyStoreRedis;
import org.ff4j.web.FF4jDispatcherServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//http://localhost:8080/ff4j-web-console/features

@Configuration
@Slf4j
public class FF4jConfiguration {

  private static final String DEFAULT_CONSOLE = "/ff4j-web-console/*";


  @Bean
  public FF4j configureFF4j() {
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
  public ServletRegistrationBean servletRegistrationBean(@Autowired final FF4j ff4j) {
    return new ServletRegistrationBean(getFF4JServlet(ff4j), DEFAULT_CONSOLE);
  }

  private FF4jDispatcherServlet getFF4JServlet(FF4j ff4j) {
    FF4jDispatcherServlet ff4jDispatcherServlet = new FF4jDispatcherServlet();
    ff4jDispatcherServlet.setFf4j(ff4j);
    return ff4jDispatcherServlet;
  }
}
