package com.gyan.springlearning.advancedwiring;

import com.gyan.springlearning.advancedwiring.config.DevEmployeeConfig;
import com.gyan.springlearning.advancedwiring.config.ProdEmployeeConfig;
import com.gyan.springlearning.advancedwiring.profile.model.Employee;
import com.gyan.springlearning.advancedwiring.profile.service.EmployeeService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {DevEmployeeConfig.class,ProdEmployeeConfig.class},loader=AnnotationConfigContextLoader.class)
@ActiveProfiles(value="prod")
public class Spring3ProdProfilesTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Ignore
    @Test
    public void testProdDataSource() {
        EmployeeService service = (EmployeeService)applicationContext.getBean("employeeService");
        assertNotNull(service);
        List<Employee> employeeDetails = service.getEmployeeDetails();
        assertEquals(3, employeeDetails.size());
        assertEquals("Ramu", employeeDetails.get(0).getName());
        assertEquals("Charan", employeeDetails.get(1).getName());
        assertEquals("Joe", employeeDetails.get(2).getName());
    }
}