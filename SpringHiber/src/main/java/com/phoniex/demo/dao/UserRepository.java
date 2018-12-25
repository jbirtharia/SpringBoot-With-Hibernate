package com.phoniex.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.phoniex.demo.model.Employee;


public interface UserRepository extends JpaRepository<Employee,Integer>{
		
}
