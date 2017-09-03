package com.ben.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chuanben on 2017/9/3.
 */
@Configuration
public class TestConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public IRule ribbonRule() {
       return new RandomRule();
    }
}
