package com.gyan.springlearning.advancedwiring.config;

import com.gyan.springlearning.advancedwiring.profile.dao.DataSource;
import com.gyan.springlearning.advancedwiring.profile.dao.EmployeeDAO;
import com.gyan.springlearning.advancedwiring.profile.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig{
    @Autowired
    private DataSource dataSource;

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService(employeeDAO());
    }

    @Bean
    public EmployeeDAO employeeDAO() {
        return new EmployeeDAO(dataSource);
    }
}