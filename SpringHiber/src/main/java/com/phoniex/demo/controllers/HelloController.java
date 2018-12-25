package com.phoniex.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.phoniex.demo.dao.UserDao;
import com.phoniex.demo.model.Employee;


@RestController
public class HelloController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public @ResponseBody List<Employee> GetAll()
	{
		List<Employee> userList=userDao.GetAll();
		for (Employee user : userList) {
			
			System.err.println("User Name : "+user.getName());
		}
		return userList;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	public @ResponseBody Employee DataById(@PathVariable("id") Integer id)
	{
		System.err.println("Id : "+id);
		return userDao.findOne(id);
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return userDao.save(emp);
	}
	
	
}
