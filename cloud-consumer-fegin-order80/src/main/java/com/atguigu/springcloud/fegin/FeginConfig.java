package com.atguigu.springcloud.fegin;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeginConfig {

    @Bean
    Logger.Level feginLoggerLevel(){
        return Logger.Level.FULL;
    }
}
