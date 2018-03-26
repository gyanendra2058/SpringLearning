package com.gyan.springlearning.advancedwiring.profile.dao;

import com.gyan.springlearning.advancedwiring.profile.model.Employee;

import java.util.List;

public interface DataSource {
    List<Employee> getEmployeeDetails();

}
