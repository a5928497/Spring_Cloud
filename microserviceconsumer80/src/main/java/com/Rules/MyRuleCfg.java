package com.Rules;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRuleCfg {

    @Bean
    public IRule myRule() {
        return new MyRule();
    }
}
