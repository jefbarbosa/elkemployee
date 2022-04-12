package com.jef.elkemployee.repository;

import com.jef.elkemployee.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
    Employee findByFirstNameLike(String firstName);
}
