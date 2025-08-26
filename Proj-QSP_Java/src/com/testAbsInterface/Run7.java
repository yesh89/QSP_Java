package com.testAbsInterface;

class A8 {
	public void m1() {
		System.out.println("Inside m1 method");
	}
}

interface B8 {
	void m2();
}

class C8 extends A8 implements B8 {
	public void m2() {
		System.out.println("Inside m2 method");
	}
}

public class Run7 {
	public static void main(String[] args) {
		C8 objC = new C8();
		objC.m1();
		objC.m2();
	}
}
