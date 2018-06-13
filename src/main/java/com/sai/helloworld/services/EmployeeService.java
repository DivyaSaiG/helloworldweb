package com.sai.helloworld.services;

import java.util.List;

import com.sai.helloworld.model.Employee;
import com.sai.helloworld.repository.EmployeeRepositoty;

public class EmployeeService {

	private EmployeeRepositoty repository;
	
	public EmployeeService() {
		repository = new EmployeeRepositoty();
	}
	
	public void create(Employee employee){
		repository.addEmployee(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return repository.getEmployeeList();
	}
	
	public Employee getEmployeeById(int empId){
		return repository.getEmployeeById(empId);
	}
	
	public void updateEmployee(Employee emp){
		repository.updateEmployeeById(emp);
	}
	}
