package com.example.restservice.api;

import com.example.restservice.model.*;
import com.example.restservice.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    //Get
    @GetMapping("/employee")
    public List<Employee> getALlEmployees(){
        return employeeService.getAllEmployees();
    }

    //use same route, send an id to filter the data (using PathVariable)
    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable int id){
        return employeeService.getById(id);
    }

    //Post
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }

    //Put
    

    //Delete
}