package com.mango.spring.jwt_token.model;

import javassist.SerialVersionUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee")
public class Employee {
    private static final long SERIAL_VERSION_UID = 123456789L;


    private Long id;
    private String name;

    public Employee() {
    }

    public Employee(Long id, String name) {
        this.id   = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
