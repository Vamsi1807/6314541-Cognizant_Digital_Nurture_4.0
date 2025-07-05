package com.diff.diff_jpa_hibernate.service;

import com.diff.diff_jpa_hibernate.model.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceHibernate {

    @Autowired
    private SessionFactory sessionFactory; // Let Spring provide the SessionFactory

    public Employee hibernateSave(Employee employee) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            System.out.println("\nAdding Employee using Hibernate: " + employee.toString());
            session.save(employee);
            transaction.commit();
            return employee;
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw new RuntimeException("Failed to save employee", e);
        } finally {
            if (session != null) session.close();
        }
    }
}