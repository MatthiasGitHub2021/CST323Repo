package com.gcu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * UserEntity to match database table attributes named cloud_testing in MAMP
 */
@Table("users")
public class UserEntity {

    @Id
    private int id;

    @Column("FirstName")
    private String firstName;

    @Column("LastName")
    private String lastName;

    @Column("UserName")
    private String username;

    @Column("Password")
    private String password;

    public UserEntity(int id, String firstName, String lastName, String username, String password) {
       super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public UserEntity(){}

    //getters/setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
