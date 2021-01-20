package com.example.university.repository;

import com.example.university.model.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectorRepository extends JpaRepository<Lector, Long> {
    @Query(value = "select lectors.id, lectors.first_name, lectors.last_name, lectors.degree, lectors.salary " +
            "from lectors " +
            "inner join department_lector " +
            "on lectors.id = department_lector.lector_id " +
            "where department_lector.department_id = ?1", nativeQuery = true)
    List<Lector> getAllEmployeeOfDepartment(long id);

    @Query(value = "select * from lectors l " +
            "where concat(l.id, '') like :template or " +
            "lower(l.first_name) like lower(concat('%', :template, '%')) or " +
            "lower(l.last_name) like lower(concat('%', :template, '%'))", nativeQuery = true)
    List<Lector> findByTemplate(String template);
}
