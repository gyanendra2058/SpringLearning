package com.gyan.springlearning.advancedwiring.runner;

import com.gyan.springlearning.advancedwiring.profile.AppConfig;
import com.gyan.springlearning.advancedwiring.profile.dao.MovieDao;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class ProfileRunner {

    private static final Logger log = Logger.getLogger(ProfileRunner.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //Enable a "live" profile
        context.getEnvironment().setActiveProfiles("live");
        context.register(AppConfig.class);
        context.refresh();
        //shut down the Spring context.
        ((ConfigurableApplicationContext)context).close();

    }
}
