package com.testAbsInterface;

//Demo of Abstract methods and classes
abstract class A3 {
	abstract void m1();

	public void m2() {
		System.out.println("inside m2 method of class A3");
	}
}

class B3 extends A3 {
	void m1() {
		System.out.println("Inside m1 overridden method");
	}
}

public class Run2 {
	public static void main(String[] args) {
		B3 objB = new B3();
		objB.m1();
		objB.m2();
	}
}
