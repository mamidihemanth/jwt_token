package com.mango.spring.jwt_token.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class User {

    @Id
    private int id;
    private String userName;
    private String password;

}
