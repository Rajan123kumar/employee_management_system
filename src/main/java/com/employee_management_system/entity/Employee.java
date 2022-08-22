package com.employee_management_system.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "EMP_SYSTEM")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private String Address;
	private String Email;
	private String PhoneNo;
	private int Salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String address, String email, String phoneNo, int salary) {
		super();
		Id = id;
		Name = name;
		Address = address;
		Email = email;
		PhoneNo = phoneNo;
		Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", Email=" + Email + ", PhoneNo="
				+ PhoneNo + ", Salary=" + Salary + "]";
	}

}
