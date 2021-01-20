package com.example.university.service.impl;

import com.example.university.model.Degree;
import com.example.university.model.Lector;
import com.example.university.repository.DepartmentRepository;
import com.example.university.repository.LectorRepository;
import com.example.university.service.LectorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LectorServiceImpl implements LectorService {

    private DepartmentRepository departmentRepository;
    private LectorRepository lectorRepository;


    @Override
    public long departmentStatistics(String name, Degree degree) {
        long id = departmentRepository.getDepartmentByName(name).getId();
        List<Lector> lectors = lectorRepository.getAllEmployeeOfDepartment(id);

        return lectors.stream().filter(l -> l.getDegree().toString().equals(degree.toString())).count();
    }

    @Override
    public List<Lector> findByTemplate(String template) {
        return lectorRepository.findByTemplate(template);
    }
}
