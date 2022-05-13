//package com.gcu.entity;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.relational.core.mapping.Column;
//import org.springframework.data.relational.core.mapping.Table;
//
///**
// * UserEntity to match database table attributes named cloud_testing in MAMP
// */
//@Table("users")
//public class UserEntity {
//
//    @Id
//    private int id;
//
//    @Column("FirstName")
//    private String firstName;
//
//    @Column("LastName")
//    private String lastName;
//
//    @Column("UserName")
//    private String userName;
//
//    @Column("Password")
//    private String password;
//
//    public UserEntity(int id, String firstName, String lastName, String userName, String password) {
//       super();
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.userName = userName;
//        this.password = password;
//    }
//
//    public UserEntity(){}
//
//    //getters/setters
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
