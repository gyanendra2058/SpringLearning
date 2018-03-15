package com.gyan.springlearning.beanwiring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.gyan.springlearning.beanwiring.impl"})
public class CDPlayerConfig {
}
