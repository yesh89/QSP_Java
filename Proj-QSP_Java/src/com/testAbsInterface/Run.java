package com.testAbsInterface;

//A final method cannot be overridden in any of its subclasses

class A1 {

	public final void m1() {
		System.out.println("Inside m1 method of class A");
	}
}

class B1 extends A1 {
	/*
	 * public void m1() { System.out.println("Inside m1 method of class B"); }
	 */
}

public class Run {
	public static void main(String[] args) {

	}
}
