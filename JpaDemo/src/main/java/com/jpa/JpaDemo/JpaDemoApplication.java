package com.jpa.JpaDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpa.dao.CustomerDao;
import com.jpa.dao.CustomerDataJpaDao;
import com.jpa.dao.DepartmentDao;
import com.jpa.dao.EmployeeDao;
import com.jpa.entities.Address;
import com.jpa.entities.Customer;
import com.jpa.entities.Department;
import com.jpa.entities.Employee;
import com.jpa.entities.Student;

@SpringBootApplication
@EntityScan(basePackages = "com.jpa.entities")
@EnableJpaRepositories(basePackages = "com.jpa.dao")
public class JpaDemoApplication implements CommandLineRunner{
	@Autowired
   private CustomerDataJpaDao customerDataJpaDao;
	
	@Autowired
	DepartmentDao departmentDao;
	@Autowired
	EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

//      Department department=new Department();
//      department.setDeptname("HR");
//      
//      List<Employee> employees=new ArrayList<Employee>();
//      employees.add(new Employee("Jack",12000,department));
//      employees.add(new Employee("Paul",13400,department));
//      employees.add(new Employee("Anu",15000,department));
//      
//      department.setEmployees(employees);
//      
//      departmentDao.save(department);
		
//1   employeeDao.deleteById(10);
		//Adding a new EMPLOYEE in an already existing department
//		Department department =departmentDao.getReferenceById(7);
//		Employee employee=new Employee("James",13409,department);
//		employeeDao.save(employee);
		
		System.out.println(employeeDao.findBySalaryLessThan(13000));
	}
}


