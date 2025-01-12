package com.constructor;

public class ClassAB {
	int i;

	// Default Constructor
	ClassAB() {

	}

	// Parameterized Constructor
	ClassAB(int a) {
		i = a;
	}

	public static void main(String[] args) {
		ClassAB ob1 = new ClassAB();
		System.out.println(ob1.i);
		ClassAB ob2 = new ClassAB(4);
		System.out.println(ob2.i);
		ClassAB ob3 = new ClassAB(10);
		System.out.println(ob3.i);

	}
}
