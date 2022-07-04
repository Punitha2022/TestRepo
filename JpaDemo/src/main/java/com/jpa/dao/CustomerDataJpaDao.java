package com.jpa.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.entities.Customer;
//													Entity name    TYpe of pk
@Repository
@Transactional
public interface CustomerDataJpaDao extends JpaRepository<Customer, Integer> {
   List<Customer> findByFirstname(String firstname);
   
   List<Customer> findByFirstnameAndLastname(String firstname,String lastname);
   
   List<Customer> findByFirstnameContaining(String substr);
   
   @Modifying
   @Query("update Customer c set c.lastname=?1 where c.id=?2")
   void updateLastname(String lastname,int id);
}
