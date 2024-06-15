package com.codingshuttle.anujTutorial.tutorial.controllers;

// Operations
// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.codingshuttle.anujTutorial.tutorial.dto.EmployeeDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId){
        return new EmployeeDTO(employeeId, "Anuj",LocalDate.of(2024, 1, 1),true);
    }

    @GetMapping(path = "/employees")
    public String getData(@PathParam("sortBy")  String sortBy , @PathParam("limit") Integer limit ){
        return "Hello" + sortBy + " " + limit;
    }
}
