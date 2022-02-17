package com.example.restservice.service;

import com.example.restservice.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees(){

        Employee employee1 = new Employee(1, "Jack", "Daniels", new Address(234, "Ellen lane", "I3N5H2"));
        Employee employee2 = new Employee(2, "Johnnie", "Walker", new Address(567, "Sunny road", "Q3D6D9"));
        Employee employee3 = new Employee(3, "Jim", "Beam", new Address(890, "Ninth ave", "P3Y6I9"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }

    public Employee getById(int id){
        for(Employee emp : employees){
            if (emp.getId() == id){
                return emp;
            }
        }
        return null;
        //return employees.stream().filter(employee -> employee.getId() == id).findFirst().get();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}