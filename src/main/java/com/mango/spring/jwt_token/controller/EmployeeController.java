package com.mango.spring.jwt_token.controller;


import com.mango.spring.jwt_token.model.Employee;
import com.mango.spring.jwt_token.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET, value = "employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployees() {
       return employeeService.getEmployees();
    }

    @RequestMapping(method = RequestMethod.GET, value = "employees/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployees(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "employee", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.POST, value = "employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return employeeService.addEmployees(employees);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee update(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.GET, value = "employees/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getCount() {
        return employeeService.getCount();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "employee", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestBody Employee employee) {
        employeeService.delete(employee);
    }



}
