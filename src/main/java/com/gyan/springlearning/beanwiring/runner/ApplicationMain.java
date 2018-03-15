package com.gyan.springlearning.beanwiring.runner;

import com.gyan.springlearning.beanwiring.configuration.CDPlayerConfig;
import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CompactDisc compactDisc = (CompactDisc)ctx.getBean("someRandomBeanIDForTesting");
        compactDisc.play();
    }
}
