package com.gyan.springlearning.advancedwiring.profile.dao;

import com.gyan.springlearning.advancedwiring.profile.model.Employee;

import java.util.List;

public class EmployeeDAO {
    private DataSource dataSource;

    public EmployeeDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public List<Employee> getEmployeeDetails() {
        return dataSource.getEmployeeDetails();
    }
}
