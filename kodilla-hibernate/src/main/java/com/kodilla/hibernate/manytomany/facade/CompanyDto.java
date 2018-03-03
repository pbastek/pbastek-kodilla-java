package com.kodilla.hibernate.manytomany.facade;

import lombok.Getter;

@Getter
public class CompanyDto{

    private String name;

    public CompanyDto(String name) {
        this.name = name;
    }
}
