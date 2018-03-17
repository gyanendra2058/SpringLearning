package com.gyan.springlearning.beanwiring.configuration;

import com.gyan.springlearning.beanwiring.impl.CompactDiscBeanDiscoveryIF;
import com.gyan.springlearning.beanwiring.impl.HimeshReshamiyaMusic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CompactDiscBeanDiscoveryIF.class})
public class CDPlayerConfig {
}
