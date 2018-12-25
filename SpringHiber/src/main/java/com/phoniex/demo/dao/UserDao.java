package com.phoniex.demo.dao;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phoniex.demo.model.Employee;

@Service
public class UserDao {
	
	@Autowired
	UserRepository userRepository;

	public List<Employee> GetAll()
	{
		return userRepository.findAll();
	}
	
	public Employee findOne(Integer id) {
		
		Employee emp=userRepository.getOne(id);
		System.err.println("Employee Name : "+emp.getName());
		return emp;		
	}

	public Employee save(@Valid Employee emp) {
		// TODO Auto-generated method stub
		return userRepository.save(emp);
	}
	
}
