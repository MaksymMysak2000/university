package com.example.university.repository;

import com.example.university.model.Department;
import com.example.university.model.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department getDepartmentByName(String name);

    @Query(value = "select " +
            "avg (salary) " +
            "from lectors " +
            "inner join department_lector " +
            "on lectors.id = department_lector.lector_id " +
            "where department_lector.department_id = ?1", nativeQuery = true)
    double averageSalary(long id);

    @Query(value = "select " +
            "count (id) " +
            "from lectors " +
            "inner join department_lector " +
            "on lectors.id = department_lector.lector_id " +
            "where department_lector.department_id = ?1", nativeQuery = true)
    long countAllEmployeeForDepartment(long id);


}
