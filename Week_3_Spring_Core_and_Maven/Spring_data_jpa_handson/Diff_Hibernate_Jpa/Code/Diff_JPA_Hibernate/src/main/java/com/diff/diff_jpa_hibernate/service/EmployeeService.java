package com.diff.diff_jpa_hibernate.service;

import com.diff.diff_jpa_hibernate.model.Employee;
import com.diff.diff_jpa_hibernate.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo empRepo;

    public Employee saveEmployee(Employee emp) {
        System.out.println("\nAdding Employee using Hibernate: " + emp.toString());
        return empRepo.save(emp);
    }


}