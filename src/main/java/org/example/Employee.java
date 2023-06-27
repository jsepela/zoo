package org.example;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double hourlyWage;

    public Employee(String firstName, String lastName, String email, String phoneNumber, double hourlyWage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hourlyWage = hourlyWage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }
}
