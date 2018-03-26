package com.gyan.springlearning.advancedwiring.profile.dao;

import com.gyan.springlearning.advancedwiring.profile.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DevDatabaseUtil implements DataSource {

    public List<Employee> getEmployeeDetails() {
        List<Employee> empDetails = new ArrayList<Employee>();
        Employee emp1 = new Employee(111, "Abc", 11000);
        Employee emp2 = new Employee(222, "Xyz", 22000);
        empDetails.add(emp1);
        empDetails.add(emp2);

        return empDetails;
    }
}
