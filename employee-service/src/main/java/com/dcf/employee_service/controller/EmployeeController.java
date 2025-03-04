package com.dcf.employee_service.controller;

import com.dcf.employee_service.model.Employee;
import com.dcf.employee_service.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping
    public Employee add(@RequestBody Employee employee) {
        log.info("Employee add");
        return employeeRepository.addDepartment(employee);
    }

    @GetMapping
    public List<Employee> findAll() {
        log.info("Employee findAll");
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {
        log.info("Employee findById");
        return employeeRepository.findById(id);
    }

}
