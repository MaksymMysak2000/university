package com.example.university.service;

import com.example.university.model.Degree;
import com.example.university.model.Lector;

public interface DepartmentService {
    Lector getHeaderByDepartmentName(String departmentName);

    double averageSalaryForTheDepartment(String name);

    long countEmployees(String name);

}
