package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jpa.entities.Customer;
import com.jpa.entities.Student;

@Repository 
@Transactional 
public class CustomerDao {
	 
	public CustomerDao() {
		System.out.println("<<<<<<<<CUSTOMER DAO OBJECT CREATED>>>>>>>");
	}
	
	@PersistenceContext
	EntityManager entityManager;
	public int saveCustomer(Customer customer) {
		System.out.println("Id of the customer before persist " + customer.getId());
		entityManager.persist(customer);
		System.out.println("Id of the customer after persist " + customer.getId());
		return customer.getId();

	}
	public int saveStudent(Student student) {//import student
		System.out.println("Id of the customer before persist " + student.getId());
		entityManager.persist(student);//insert data into the table
		System.out.println("Id of the customer after persist " + student.getId());
		return student.getId();
	}
  	
	public Customer getCustomer(int id) {//for eg id=2
		Customer customer= entityManager.find(Customer.class, id);
		return customer;
		//select * from customer where id=2
		
	}
	public Customer updateCustomer(Customer updatedCustomer) {
		entityManager.merge(updatedCustomer);
		return updatedCustomer;
	}
	
	public void deleteCustomer(int id) {
		Customer customer=entityManager.find(Customer.class, id);
		entityManager.remove(customer);
	}
	
	public List<Customer> getAllCustomers(){
	TypedQuery<Customer> namedQuery=
			entityManager.createNamedQuery("get_all_customers", Customer.class);
	return namedQuery.getResultList();
	}
}



