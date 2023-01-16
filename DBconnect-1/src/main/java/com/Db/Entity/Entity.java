package com.Db.Entity;

public class Entity 
{
	private int Empid;
	private String Empname;
	private double Empsalary;
	
	public Entity(int empid, String empname, double empsalary) {
		super();
		Empid = empid;
		Empname = empname;
		Empsalary = empsalary;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public double getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(double empsalary) {
		Empsalary = empsalary;
	}
	
}

