package com.jef.elkemployee.service;

import com.jef.elkemployee.model.Employee;
import com.jef.elkemployee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findByFirstNameLike(String firstName) {
        return employeeRepository.findByFirstNameLike(firstName);
    }

    public List<Employee> findAllEmployees(int pageNumber, int numberRegistries) {
        return employeeRepository.findAll(PageRequest.of(pageNumber, numberRegistries)).toList();
    }
}
