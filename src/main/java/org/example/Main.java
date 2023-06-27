package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        // Pridanie zamestnancov
        Employee employee1 = new Employee("Adam", "Šiba", "adam.siba@example.com", "123456789", 10.5);
        Employee employee2 = new Employee("Jana", "Krátka", "jana.krátka@example.com", "987654321", 12.75);
        Employee employee3 = new Employee("Ivan", "Ivanuška", "i.ivan@example.com", "+4203245982", 122.75);

        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);

        // Výpis zamestnancov
        employeeService.printEmployees();

        // Odstránenie zamestnanca
        employeeService.removeEmployee(employee2);

        // Aktualizovaný výpis zamestnancov
        employeeService.printEmployees();
        }
    }