package com.springboot.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.project.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}