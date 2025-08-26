package com.inheritance;

class A1 {
	int i = 9;

	void m1() {
		System.out.println("Inside m1");
	}
}

class B1 extends A1 {
	int j = 4;

	void m2() {
		System.out.println("Inside m2");
	}
}

public class RunSingleInheritance {
	public static void main(String[] args) {
		A1 objA = new A1();
		objA.m1();
		System.out.println(objA.i);
		System.out.println("*********************");
		B1 objB = new B1();
		objB.m2();
		objB.m1();
		System.out.println(objB.i);
		System.out.println(objB.j);

	}
}
