package com.example.employee.controller;


import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepo;
import com.example.employee.response.EmployeeResponse;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees/{emp_id}")
    ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("emp_id") int id){

    EmployeeResponse employeeResponse=employeeService.getEmployeeById(id);
    return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);

    }

}
