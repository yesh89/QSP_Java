package com.basics;

public class Student {

	int sId;
	String sName;
	int sMarks;
	static String sCollege = "DAIT";

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

	public static void main(String[] args) {
		System.out.println("Student Details :- ");
		Student st = new Student();
		st.setsId(100);
		st.setsName("Test");
		st.setsMarks(625);
		System.out.println("Student ID : " + st.getsId());
		System.out.println("Student Name : " + st.getsName());
		System.out.println("Student Marks : " + st.getsMarks());
		System.out.println("STudent clg : " + sCollege);

	}
}
