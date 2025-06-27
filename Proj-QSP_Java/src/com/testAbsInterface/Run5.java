package com.testAbsInterface;

interface A6 {
	void m1();

	void m2();
}

abstract class B6 implements A6 {
	public void m1() {
		System.out.println("Inside m1 method");
	}
}

class C6 extends B6 {
	public void m2() {
		System.out.println("Inside m2 method");
	}
}

public class Run5 {
	public static void main(String[] args) {
		C6 objC = new C6();
		objC.m1();
		objC.m2();
	}
}
