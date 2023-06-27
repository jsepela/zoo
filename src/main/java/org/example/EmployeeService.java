package org.example;

import java.util.ArrayList;
import java.util.List;

class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println("First Name: " + employee.getFirstName());
            System.out.println("Last Name: " + employee.getLastName());
            System.out.println("Email: " + employee.getEmail());
            System.out.println("Phone Number: " + employee.getPhoneNumber());
            System.out.println("Hourly Wage: " + employee.getHourlyWage());
            System.out.println("--------------------");
        }
    }
}
