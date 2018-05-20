package com.lzl;

import com.Rules.MyRule;
import com.Rules.MyRuleCfg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRuleCfg.class)
public class Consumer80_APP {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80_APP.class,args);
    }
}
