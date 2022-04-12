package com.jef.elkemployee.controller;

import com.jef.elkemployee.model.Employee;
import com.jef.elkemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<String> findEmployeeByFirstName(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @GetMapping("/find-by-first-name")
    public ResponseEntity<Employee> findByFirstNameLike(@RequestParam("first-name") String firstName) {
        return new ResponseEntity<>(employeeService.findByFirstNameLike(firstName), HttpStatus.OK);
    }

    @GetMapping("/find-all-employees")
    public ResponseEntity<List<Employee>> findByFirstNameLike(@RequestParam(value = "page-number", defaultValue = "0") int pageNumber,
                                                             @RequestParam(value = "number-registries", defaultValue = "2") int numberRegistries) {
        return new ResponseEntity<>(employeeService.findAllEmployees(pageNumber, numberRegistries), HttpStatus.OK);
    }

}
