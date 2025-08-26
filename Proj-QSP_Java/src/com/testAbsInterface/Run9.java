package com.testAbsInterface;

interface A10 {
	void m1();
}

interface B10 {
	void m2();
}

abstract class C10 implements A10, B10 {
	public void m1() {
		System.out.println("Inside m1 method");
	}

	abstract void m3();
}

class D10 extends C10 {
	public void m2() {
		System.out.println("Inside m2 method");
	}

	public void m3() {
		System.out.println("Inside m3 method");
	}
}

public class Run9 {
	public static void main(String[] args) {
		D10 objD = new D10();
		objD.m1();
		objD.m2();
		objD.m3();
	}
}
