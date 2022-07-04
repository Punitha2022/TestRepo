package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
  List<Employee> findBySalaryLessThan(double salary);
}
