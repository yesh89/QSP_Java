package com.basics;

public class Employee {

	int eID;
	String eName;
	int eSalary;
	static String eCompany = "IVNT";

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public static void main(String[] args) {
		System.out.println("Employee Details :-");
		Employee empObj = new Employee();
		empObj.seteID(11862);
		System.out.println("Employee ID : " + empObj.geteID());
		empObj.seteName("yesh");
		System.out.println("Employee Name : " + empObj.geteName());
		empObj.seteSalary(1000000000);
		System.out.println("Employee Salary : " + empObj.geteSalary());
	}
}
