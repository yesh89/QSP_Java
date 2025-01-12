package com.basics;

//Example of Default Constructor
public class ClassAB {
	int i;

	public ClassAB() {
		System.out.println("Inside Constructor body");
		i = 100;
	}

	public static void main(String[] args) {
		ClassAB objAB1 = new ClassAB();
		System.out.println(objAB1.i);

		ClassAB objAB2 = new ClassAB();
		System.out.println(objAB2.i);
	}
}
