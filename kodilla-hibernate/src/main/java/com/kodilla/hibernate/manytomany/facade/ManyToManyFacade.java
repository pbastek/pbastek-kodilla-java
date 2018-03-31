
package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;
    private FacadeMapper facadeMapper;

    public ManyToManyFacade(CompanyDao companyDao, EmployeeDao employeeDao, FacadeMapper facadeMapper) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
        this.facadeMapper = facadeMapper;
    }

    public List<CompanyDto> findCompaniesWithNameLike(String name) {
        List<Company> newCompany = companyDao.findCompaniesWithNameLike(name);
        return facadeMapper.companiesToCompanyDtos(newCompany);
    }

    public List<EmployeeDto> findEmployeesWithNameLike(String name) {
        List<Employee> newEmployee = employeeDao.findEmployeesWithNameLike(name);
        return facadeMapper.employeesToEmployeeDtos(newEmployee);
    }

    public void addCompany(CompanyDto company){
        Company newCompany = facadeMapper.companyDtoToCompany(company);
        companyDao.save(newCompany);
    }

    public void addEmployee(EmployeeDto employee){
        Employee newEmployee = facadeMapper.employeeDtoToEmployee(employee);
        employeeDao.save(newEmployee);
    }
}

