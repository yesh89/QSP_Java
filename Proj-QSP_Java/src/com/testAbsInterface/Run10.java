package com.testAbsInterface;

interface B11 {
	void m1();
}

interface C11 extends B11 {
	void m2();
}

abstract class A11 {
	abstract public void m3();
}

abstract class D11 extends A11 implements C11 {
	public void m2() {
		System.out.println("Inside m2 method");
	}
}

class E11 extends D11 {
	public void m1() {
		System.out.println("Inside m1 method");
	}

	public void m3() {
		System.out.println("Inside m3 method");
	}
}

public class Run10 {
	public static void main(String[] args) {
		E11 objE = new E11();
		objE.m1();
		objE.m2();
		objE.m3();
	}
}
