package com.diff.diff_jpa_hibernate;

import com.diff.diff_jpa_hibernate.model.Employee;
import com.diff.diff_jpa_hibernate.service.EmployeeService;
import com.diff.diff_jpa_hibernate.service.EmployeeServiceHibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiffJpaHibernateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiffJpaHibernateApplication.class, args);

        EmployeeService empService = context.getBean(EmployeeService.class);
        Employee emp = new Employee("manoj", 80000, "IT");
        Employee savedEmployee = empService.saveEmployee(emp);
        System.out.println("Successfully saved employee with ID using Spring-JPA: " + savedEmployee.getId());

        EmployeeServiceHibernate empHibernate = context.getBean(EmployeeServiceHibernate.class);
        Employee emp2 = new Employee("krishna", 80000, "HRM");
        Employee savedEmployee2 = empHibernate.hibernateSave(emp2);
        System.out.println("Successfully saved employee with ID using Hibernate: " + savedEmployee2.getId());

        context.close();
    }
}