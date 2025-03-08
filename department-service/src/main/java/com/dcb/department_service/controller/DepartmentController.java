package com.dcb.department_service.controller;

import com.dcb.department_service.client.EmployeeClient;
import com.dcb.department_service.model.Department;
import com.dcb.department_service.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping
    public Department add(@RequestBody Department department) {
        log.info("Department add");
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll() {
        log.info("Department findAll");
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        log.info("Department findById");
        return departmentRepository.findById(id);
    }

    @GetMapping("/with-employee")
    public List<Department> findAllWithEmployees() {
        log.info("Department findAllWithEmployees");
        List<Department> departments = departmentRepository.findAll();
        departments.forEach(department -> department.setEmployees(employeeClient.findByDepartment(department.getId())));
        return departments;
    }
}
