package com.mango.spring.jwt_token.service.serviceImpl;

import com.mango.spring.jwt_token.model.Employee;
import com.mango.spring.jwt_token.repository.EmployeeRepository;
import com.mango.spring.jwt_token.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> emp = employeeRepository.findById(id);
        if(emp.isPresent()) {
            return emp.get();
        }
        return new Employee();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> addEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public long getCount() {
        return employeeRepository.count();
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
