package com.kodilla.hibernate.manytomany.facade;

import lombok.Getter;

@Getter
public class EmployeeDto {

    private String firstName;
    private String lastName;

    public EmployeeDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
