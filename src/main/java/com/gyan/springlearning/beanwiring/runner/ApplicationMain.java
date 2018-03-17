package com.gyan.springlearning.beanwiring.runner;

import com.gyan.springlearning.beanwiring.impl.CDPlayerJC;
import com.gyan.springlearning.beanwiring.javabasedconfig.CDPlayerJavaPlusAutoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerJavaPlusAutoConfig.class);
        CDPlayerJC cdPlayerJC = (CDPlayerJC)ctx.getBean("cdPlayerHybridBean");
        cdPlayerJC.play();
    }
}
