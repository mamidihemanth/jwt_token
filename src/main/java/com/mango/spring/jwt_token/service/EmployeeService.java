package com.mango.spring.jwt_token.service;

import com.mango.spring.jwt_token.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployeeById(Long id);

    Employee addEmployee(Employee employee);

    List<Employee> addEmployees(List<Employee> employees);

    Employee updateEmployee(Employee employee);

    long getCount();

    void delete(Employee employee);
}
