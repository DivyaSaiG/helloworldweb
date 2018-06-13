package com.sai.helloworld.repository;

import java.util.ArrayList;
import java.util.List;

import com.sai.helloworld.model.Employee;

public class EmployeeRepositoty {

	private List<Employee> employeeList;

	public EmployeeRepositoty() {
		employeeList = new ArrayList<>();
		Employee emp1 = new Employee(0, "Sai", "Chaitanya", "IT");
		Employee emp2 = new Employee(1, "Sai", "Divya", "admin");
		employeeList.add(emp1);
		employeeList.add(emp2);
	}
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void addEmployee(Employee employee){
		this.employeeList.add(employee);
	}
	
	public Employee getEmployeeById(int empId){
		Employee outputEmployee = null ;
		
		for(Employee emp: employeeList){
			if(emp.getEmployeeId()==empId){
				outputEmployee = emp;
				break;
			}
		}
		return outputEmployee;
		
	}
	
	public void updateEmployeeById(Employee	emp){
		
		for(Employee emp1: employeeList){
			if(emp1.getEmployeeId()==emp.getEmployeeId()){
				emp1.setFirstName(emp.getFirstName()); 
				emp1.setLastname(emp.getLastname());
				emp1.setDepartment(emp.getDepartment());
				break;
			}
		}
		
	}

	
}
