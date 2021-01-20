package com.example.university.service.impl;

import com.example.university.model.Degree;
import com.example.university.model.Lector;
import com.example.university.repository.DepartmentRepository;
import com.example.university.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Lector getHeaderByDepartmentName(String departmentName) {
        return departmentRepository.getDepartmentByName(departmentName).getHeader();
    }

    @Override
    public double averageSalaryForTheDepartment(String name) {
        return departmentRepository
                .averageSalary(departmentRepository.getDepartmentByName(name).getId());
    }

    @Override
    public long countEmployees(String name) {
        return departmentRepository.countAllEmployeeForDepartment(
                departmentRepository.getDepartmentByName(name).getId());
    }



}
