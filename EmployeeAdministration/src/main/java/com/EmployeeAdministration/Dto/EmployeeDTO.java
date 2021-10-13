package com.EmployeeAdministration.Dto;



public class EmployeeDTO {
    private Long id;
    private String name;
    private String number;
    private String location;

    public EmployeeDTO(Long id,String name, String number, String location) {
        super();
        this.id=id;
        this.name = name;
        this.number = number;
        this.location = location;
    }

    public EmployeeDTO() {

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
