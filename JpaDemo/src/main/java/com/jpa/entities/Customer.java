package com.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity//Map the class Customer with the relational table Customer
@NamedQuery(name="get_all_customers",query="select c from Customer c")
// select c from Customer c - JPQL- customer is an entity.NOT A TABLE NAME
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)//automatically id value's will get generated
private int id;
private String firstname;
private String lastname;
private String email;
@OneToOne(cascade = CascadeType.ALL)//unidirectional
//when persist customer, it will persist address object automatically
@JoinColumn(name="cust_address")
private Address address;
//no-arg constructor is MANDATORY for an ENTITY
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(String firstname, String lastname, String email) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
}

}
