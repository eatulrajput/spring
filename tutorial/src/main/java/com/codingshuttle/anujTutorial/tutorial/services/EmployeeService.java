package com.codingshuttle.anujTutorial.tutorial.services;

import com.codingshuttle.anujTutorial.tutorial.dto.EmployeeDTO;
import com.codingshuttle.anujTutorial.tutorial.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    final EmployeeRepository employeeRepository;
    public EmployeeDTO getEmployeeById(Long id){

    }
}
