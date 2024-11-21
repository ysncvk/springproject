package com.yasincevik.repository;

import com.yasincevik.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList() {
        return employeeList;
    }

    public Employee getEmployeeById (String id) {
        Employee findedEmployee = null;
        for (Employee employee: employeeList) {
            if (id.equals(employee.getId())){
                findedEmployee = employee;
                break;
            }
        }
        return  findedEmployee;
    }

    public List<Employee> getEmployeeWithParams (String firstName, String lastName) {
        if (firstName ==null && lastName ==null) {
            return employeeList;
        }
        List<Employee> findedEmployees = new ArrayList<>();

        for (Employee employee: employeeList) {

            if(firstName != null && lastName !=null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)){
                    findedEmployees.add(employee);
                }
            }

            if(firstName != null && lastName ==null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName) ){
                    findedEmployees.add(employee);
                }
            }

            if(lastName != null && firstName==null) {
                if(employee.getLastName().equalsIgnoreCase(lastName) ){
                    findedEmployees.add(employee);
                }
            }

        }

        return findedEmployees;

    }

    public List<Employee> saveNewEmployee (Employee newEmployee) {
        employeeList.add(newEmployee);
        return employeeList;
    }

    public Boolean deleteEmployee (String Id) {
        boolean result = false;
        if (Id == null) {
            return result;
        }
        for (Employee employee: employeeList) {
            if(employee.getId().equals(Id)) {
                employeeList.remove(employee);
                result = true;
                break;
            }
        }
        return result;
    }
}
