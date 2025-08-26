package com.inheritance;

class Person {
	String fName;
	String lName;

	Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
}

class Student extends Person {
	int sId;
	int marks;

	Student(String fName, String lName, int sId, int marks) {
		super(fName, fName);
		this.sId = sId;
		this.marks = marks;
	}

	void displayStudentDetails() {
		System.out.println(fName + " " + lName + " " + sId + " " + marks);
	}
}

class Teacher extends Person {
	int tId;
	double salary;

	Teacher(String fName, String lName, int tId, double salary) {
		super(fName, lName);
		this.tId = tId;
		this.salary = salary;
	}

	void displayTeacherDetails() {
		System.out.println(fName + " " + lName + " " + tId + " " + salary);
	}
}

public class RunPerson {
	public static void main(String[] args) {
		Student stud = new Student("abc", "test", 101, 545);
		stud.displayStudentDetails();

		Teacher tea = new Teacher("xyz", "pqr", 701, 109324);
		tea.displayTeacherDetails();
	}
}
