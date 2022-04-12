package com.jef.elkemployee.repository;

import com.jef.elkemployee.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
    List<Employee> findAllByFirstNameLike(String firstName);
    Employee findByFirstNameLike(String firstName);
}
