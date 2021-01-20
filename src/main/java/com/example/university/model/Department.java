package com.example.university.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    //@JsonIgnore
    @OneToOne
    @JoinColumn(name = "header_id", referencedColumnName = "id")
    private Lector header;

    //@JsonIgnore
    @ManyToMany
    @JoinTable(name = "department_lector",
            joinColumns = @JoinColumn(name = "department_id"),
            inverseJoinColumns = @JoinColumn(name = "lector_id"))
    private List<Lector> lectorList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lector getHeader() {
        return header;
    }

    public void setHeader(Lector header) {
        this.header = header;
    }

    public List<Lector> getLectorList() {
        return lectorList;
    }

    public void setLectorList(List<Lector> lectorList) {
        this.lectorList = lectorList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", header=" + header +
                '}';
    }
}
