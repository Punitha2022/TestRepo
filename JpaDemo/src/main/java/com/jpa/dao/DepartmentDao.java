package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
