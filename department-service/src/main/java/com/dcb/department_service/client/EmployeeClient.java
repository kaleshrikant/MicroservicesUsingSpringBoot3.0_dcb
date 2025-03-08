package com.dcb.department_service.client;

import com.dcb.department_service.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface EmployeeClient {

    @GetMapping("employee/department/{departmentId}")
    public Employee findById(@PathVariable("departmentId") Long departmentId);
}
