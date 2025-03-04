package com.dcb.department_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

}
