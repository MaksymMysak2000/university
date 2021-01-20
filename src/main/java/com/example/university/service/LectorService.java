package com.example.university.service;

import com.example.university.model.Degree;
import com.example.university.model.Lector;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LectorService {
    long departmentStatistics(String name, Degree degree);

    List<Lector> findByTemplate(String template);
}
