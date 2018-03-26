package com.gyan.springlearning.advancedwiring.config;

import com.gyan.springlearning.advancedwiring.profile.dao.DataSource;
import com.gyan.springlearning.advancedwiring.profile.dao.ProductionDatabaseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public abstract class ProdEmployeeConfig{
    @Bean
    public DataSource dataSource() {
        return new ProductionDatabaseUtil();
    }
}