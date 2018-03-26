package com.gyan.springlearning.advancedwiring.profile;

import org.springframework.cache.annotation.EnableCaching;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@ComponentScan(basePackages = {"com.gyan.springlearning.advancedwiring.profile.*"})
public class AppConfig {

}
