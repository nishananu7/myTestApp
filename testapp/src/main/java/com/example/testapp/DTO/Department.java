package com.example.testapp.DTO;

public class Department implements Comparable{
	
	private int deptId;
	private String deptName;
	private String deptLoc;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public String setDeptName(String deptName) {
		return this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
public String toString() {
		
		return deptId+","+deptName+","+deptLoc;
	}
}
