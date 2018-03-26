package com.gyan.springlearning.advancedwiring.profile.service;

import com.gyan.springlearning.advancedwiring.profile.dao.EmployeeDAO;
import com.gyan.springlearning.advancedwiring.profile.model.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> getEmployeeDetails(){
        return employeeDAO.getEmployeeDetails();
    }
}
