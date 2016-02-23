package com.example.faisal.databindingsample.Model;

/**
 * <h1><font color="green">User</font></h1>
 * <p>It is Model class in we will set Data and fetch over the xml</p>---faisal
 */
public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
