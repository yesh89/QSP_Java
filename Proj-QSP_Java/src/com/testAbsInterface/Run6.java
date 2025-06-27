package com.testAbsInterface;

interface A7 {
	void m1();
}

interface B7 extends A7 {
	void m2();
}

class C7 implements B7 {
	public void m1() {
		System.out.println("Inside m1 method");
	}

	public void m2() {
		System.out.println("Inside m2 method");
	}
}

public class Run6 {
	public static void main(String[] args) {
		C7 objC = new C7();
		objC.m1();
		objC.m2();
	}
}
