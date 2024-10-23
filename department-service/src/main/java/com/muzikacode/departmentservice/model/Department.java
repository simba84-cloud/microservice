package com.muzikacode.departmentservice.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String name;
    private List<Employee> employes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employee> employes) {
        this.employes = employes;
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employes=" + employes +
                '}';
    }

}
