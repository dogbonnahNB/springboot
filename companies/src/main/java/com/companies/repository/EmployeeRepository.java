package com.companies.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.companies.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByLastName(String lastName);
    
}