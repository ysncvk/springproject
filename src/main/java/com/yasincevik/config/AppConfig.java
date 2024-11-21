package com.yasincevik.config;

import com.yasincevik.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Enes","Bayram"));
        employeeList.add(new Employee("2","Yasin","Çevik"));
        employeeList.add(new Employee("3","Mustafa","Yıldırım"));
        employeeList.add(new Employee("4","Abdullah","Yaşar"));
        employeeList.add(new Employee("5","Mahmut","Öz"));

        return employeeList;


    }
}
