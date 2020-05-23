package com.example.testapp.DTO;


public class Employee{
	
	private int empId;
	private String empName;
	private String empAddress;
	private String empPhone;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	
	public String toString() {
		
		return empId+","+empName+","+empAddress+","+empPhone;
	}

}
