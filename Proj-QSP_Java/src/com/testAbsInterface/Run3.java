package com.testAbsInterface;

abstract class A4 {
	abstract void m1();

	public void m2() {
		System.out.println("inside m2 method");
	}

	abstract void m3();
}

abstract class B4 extends A4 {

}

abstract class C4 extends B4 {
	void m1() {
		System.out.println("Inside method m1");
	}
}

abstract class D4 extends C4 {
	abstract void m4();

	public void m3() {
		System.out.println("inside method m3");
	}
}

class E4 extends D4 {
	public void m4() {
		System.out.println("Inside method m4");
	}
}

public class Run3 {
	public static void main(String[] args) {
		E4 objE = new E4();
		objE.m1();
		objE.m2();
		objE.m3();
		objE.m4();
	}
}
