package com.luv2code.springboot.cruddemo1.dao;

import com.luv2code.springboot.cruddemo1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    //that is it ..lol

}
