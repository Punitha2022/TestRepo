package com.jpa.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int deptId;
private String deptname;
@OneToMany(mappedBy = "department",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
private  List<Employee>    employees;


public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(String deptname) {
	super();
	this.deptname = deptname;
}

public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
@Override
public String toString() {
	return "Department [deptId=" + deptId + ", deptname=" + deptname + "]";
}

}
