package com.gyan.springlearning.beanwiring.javabasedconfig;

import com.gyan.springlearning.beanwiring.impl.CDPlayer;
import com.gyan.springlearning.beanwiring.impl.CDPlayerJC;
import com.gyan.springlearning.beanwiring.impl.CompactDiscBeanDiscoveryIF;
import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackageClasses = {CompactDiscBeanDiscoveryIF.class})
@ImportResource("classpath:/beans/cd.xml")
public class CDPlayerJavaPlusAutoConfig {
    @Autowired
    private CompactDisc cd;

    @Bean("cdPlayerHybridBean")
    CDPlayerJC cdPlayer(CompactDisc cd) {
        return new CDPlayerJC(cd);
    }
}
