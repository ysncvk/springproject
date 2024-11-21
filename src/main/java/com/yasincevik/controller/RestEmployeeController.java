package com.yasincevik.controller;

import com.yasincevik.model.Employee;
import com.yasincevik.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }

    @GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping(path="/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false)  String firstName, @RequestParam(name = "lastName", required = false) String lastName) {

        return employeeService.getAllEmployeeWithParams(firstName,lastName);
    }

    @PostMapping(path="/create")
    public List<Employee> saveEmployee(@RequestBody Employee newEmployee) {
        System.out.println("post isteği çalıştı");
        return employeeService.saveNewEmployee(newEmployee);
    }

    @DeleteMapping(path="delete/{id}")
    public  Boolean deleteEmployee ( @PathVariable String id) {
        return employeeService.deleteEmployee(id);
    }
}
