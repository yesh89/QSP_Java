package com.inheritance;

class A3 {
	int i = 9;

	void m1() {
		System.out.println("inside m1");
	}
}

class B3 extends A3 {
	int j = 7;

	void m2() {
		System.out.println("inside m2");
	}
}

class C3 extends B3 {
	int k = 4;

	void m3() {
		System.out.println("inside m3");
	}
}

public class RunMultiLevelInheritance {
	public static void main(String[] args) {

		A3 objA = new A3();
		objA.m1();
		System.out.println(objA.i);
		System.out.println("***********************");

		B3 objB = new B3();
		objB.m2();
		objB.m1();
		System.out.println(objB.i);
		System.out.println(objB.j);
		System.out.println("***********************");

		C3 objC = new C3();
		objC.m3();
		objC.m2();
		objC.m1();
		System.out.println(objC.i);
		System.out.println(objC.j);
		System.out.println(objC.k);
	}
}
