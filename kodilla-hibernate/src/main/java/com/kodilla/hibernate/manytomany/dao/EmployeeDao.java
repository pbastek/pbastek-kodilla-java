package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(value = "FROM Employee WHERE lastname LIKE %:NAME%")
    List<Employee> findEmployeesWithNameLike(@Param("NAME") String name);
}

