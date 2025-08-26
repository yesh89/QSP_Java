package com.inheritance;

class A {
	int i = 9;

	void m1() {
		System.out.println("inside m1");
	}
}

class B extends A {
	int j = 4;

	void m2() {
		System.out.println("inside m2");
	}
}

public class Run {
	public static void main(String[] args) {
		A objA = new A();
		objA.m1();
		System.out.println(objA.i);
		System.out.println("*****************");
		B objB = new B();
		objB.m2();
		objB.m1();
		System.out.println(objB.i + " " + objB.j);
	}
}
