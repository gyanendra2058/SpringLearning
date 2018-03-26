package com.gyan.springlearning.advancedwiring.config;

import com.gyan.springlearning.advancedwiring.profile.dao.DataSource;
import com.gyan.springlearning.advancedwiring.profile.dao.DevDatabaseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public abstract class DevEmployeeConfig {
    @Bean
    public DataSource dataSource() {
        return new DevDatabaseUtil();
    }
}
