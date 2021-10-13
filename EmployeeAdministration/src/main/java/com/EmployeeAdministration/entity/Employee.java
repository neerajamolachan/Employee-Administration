package com.EmployeeAdministration.entity;

import com.EmployeeAdministration.Dto.EmployeeDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee extends EmployeeDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Employee_id")
    private Long id;
    @Column(name="Employee_name")
    private String name;
    @Column(name="Employee_phoneNumber")
    private String number;
    @Column(name="Employee_location")
    private String location;

    public Employee() {
    }

    public Employee(Long id, String name, String number, String location) {
        super();
        this.id = id;
        this.name = name;
        this.number = number;
        this.location = location;
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }











}
