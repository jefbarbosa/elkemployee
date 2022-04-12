package com.jef.elkemployee.service;

import com.jef.elkemployee.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
public class EmployeeServiceIntTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void createEmployeeTest() {
        Employee employee = new Employee("Igor", "Mestre Nogueira", 21, "SP", "SP");

        Employee employeReturned = employeeService.createEmployee(employee);

        assertAll(
                () -> assertNotNull(employeReturned.getId()),
                () -> assertEquals("Mestre Nogueira", employeReturned.getLastName()),
                () -> assertEquals(21, employeReturned.getAge())
        );
    }
}
