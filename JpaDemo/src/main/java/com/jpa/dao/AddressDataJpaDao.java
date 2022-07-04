package com.jpa.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entities.Address;
@Repository
@Transactional
public interface AddressDataJpaDao extends JpaRepository<Address, Integer> {

}
