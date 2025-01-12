package com.basics;

//Example of Parameterized Constructor

public class ClassAB1 {
	int i;

	ClassAB1(int a) {
		i = a;
		System.out.println("Inside Constructor Body");
	}

	public static void main(String[] args) {
		ClassAB1 obj1 = new ClassAB1(100);
		System.out.println(obj1.i);
		ClassAB1 obj2 = new ClassAB1(200);
		System.out.println(obj2.i);
		ClassAB1 obj3 = new ClassAB1(300);
		System.out.println(obj3.i);
	}
}
