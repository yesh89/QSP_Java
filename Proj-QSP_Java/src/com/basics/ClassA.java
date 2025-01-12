package com.basics;

public class ClassA {

	// Data members
	static int i = 9; // Static Data Member
	int j = 10; // Non-Static Data Member

	// Member methods
	public static void m1() { // Static Data Member
		System.out.println("Inside m1");
	}

	public void m2() { // Non-Static Data Member
		System.out.println("Inside m2");
	}

	public static void main(String[] args) {
		System.out.println(i);
		ClassA obj = new ClassA();
		System.out.println(obj.j);
		obj.i = 1000;
		System.out.println(obj.i);
		obj.j = 2302;
		System.out.println(obj.j);
		m1();
		obj.m2();
	}
}
