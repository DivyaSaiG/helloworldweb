package com.sai.helloworld.model;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int employeeId;
	private String firstName;
	private transient String lastname;
	private String department;
	
public Employee( int employeeId, String firstName, String lastname, String department) {
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastname = lastname;
	this.department = department;
	
}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
