package com.diff.diff_jpa_hibernate.repo;

import com.diff.diff_jpa_hibernate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}