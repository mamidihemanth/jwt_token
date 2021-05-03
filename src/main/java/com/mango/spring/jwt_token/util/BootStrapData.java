package com.mango.spring.jwt_token.util;

import com.mango.spring.jwt_token.model.User;
import com.mango.spring.jwt_token.repository.EmployeeRepository;
import com.mango.spring.jwt_token.model.Employee;
import com.mango.spring.jwt_token.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void initUsers() {

        List<User> users = Stream.of(
                new User(1, "mango" , "mango@123"),
                new User(2, "bob" , "bob@123"),
                new User(3, "sam" , "sam@123")
        ).collect(Collectors.toList());
        userRepository.saveAll(users);
    }

    @Override
    public void run(String... args) throws Exception {

        Employee emp = new Employee(123L, "Hemanth");
        employeeRepository.save(emp);
        emp = new Employee(124L, "Kumar");
        employeeRepository.save(emp);
        emp = new Employee(125L, "Mamidi");
        employeeRepository.save(emp);
        emp = new Employee(126L, "Sai");
        employeeRepository.save(emp);
        emp = new Employee(127L, "Venakat");
        employeeRepository.save(emp);
        emp = new Employee(128L, "Kalyan");
        employeeRepository.save(emp);
        emp = new Employee(129L, "Bob");
        employeeRepository.save(emp);
        emp = new Employee(130L, "Marly");
        employeeRepository.save(emp);
        emp = new Employee(131L, "Krishna");
        employeeRepository.save(emp);
    }
}
