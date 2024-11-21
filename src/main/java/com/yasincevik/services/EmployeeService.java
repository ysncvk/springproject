package com.yasincevik.services;

import com.yasincevik.model.Employee;
import com.yasincevik.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployeeById(String Id){
        return employeeRepository.getEmployeeById(Id);
    }

    public List<Employee> getAllEmployeeWithParams(String firstName, String lastName){
        return employeeRepository.getEmployeeWithParams(firstName,lastName);
    }

    public List<Employee> saveNewEmployee (Employee newEmployee) {
        return employeeRepository.saveNewEmployee(newEmployee);
    }

    public Boolean deleteEmployee (String Id) {
        return employeeRepository.deleteEmployee(Id);
    }
}
