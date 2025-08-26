package com.abstraction;

class Student {
	private int studentId;
	private String studentName;

	Student(int sID, String sName) {
		this.studentId = sID;
		this.studentName = sName;
	}

	public int getID() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setID(int sID) {
		this.studentId = sID;
	}

	public void setStudentName(String sName) {
		this.studentName = sName;
	}
}

public class RunGetterSetter {
	public static void main(String[] args) {
		System.out.println("program starts");
		Student s1 = new Student(1001, "MS Dhoni");
		System.out.println(s1.getID()+" "+s1.getStudentName());
		System.out.println("program ends");
	}
}
