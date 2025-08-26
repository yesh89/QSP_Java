package com.casting;

class A6 {
	int i = 6;

	public void m1() {
		System.out.println("inside m1");
	}
}

class B6 extends A6 {
	int j = 9;

	public void m2() {
		System.out.println("inside m2");
	}
}

class C6 extends B6 {
	int k = 10;

	public void m3() {
		System.out.println("inside m3");
	}
}

public class Run6 {
	public static void main(String[] args) {
		B6 objB = new C6(); // upcasting
		C6 objC1 = (C6) objB; // downcasting
		System.out.println(objC1.i + " " + objC1.j + " " + objC1.k);
		objC1.m1();
		objC1.m2();
		objC1.m3();
		System.out.println("***************************************");

		A6 objA1 = new B6();
		B6 objB1 = (B6) objA1;
		System.out.println(objB1.i + " " + objB1.j);
		objB1.m1();
		objB1.m2();
		System.out.println("***************************************");

		A6 objA2 = new C6();
		C6 objC2 = (C6) objA2;
		System.out.println(objC2.i + " " + objC2.j + " " + objC2.k);
		objC2.m1();
		objC2.m2();
		objC2.m3();
	}
}
