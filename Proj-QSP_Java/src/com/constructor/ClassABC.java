package com.constructor;

//this() Statement Demo

public class ClassABC {
	int i;
	double j;

	ClassABC() {
		System.out.println("inside a no argument constructor");
	}

	ClassABC(int a) {
		this();
		System.out.println("inside an integer arg constructor");
		i = a;
	}

	ClassABC(double b) {
		this(4);
		System.out.println("inside a double arg constructor");
		j = b;
	}

	public static void main(String[] args) {
		ClassABC abc = new ClassABC(3.1416);
	}
}
