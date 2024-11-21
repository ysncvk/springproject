package com.yasincevik.controller;

import com.yasincevik.model.Employee;
import com.yasincevik.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployeeList () {
        return employeeService.getAllEmployeeList();
    }
}
