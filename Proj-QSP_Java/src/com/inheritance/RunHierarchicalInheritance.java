package com.inheritance;

class A2 {
	int i = 9;

	void m1() {
		System.out.println("inside m1");
	}
}

class B2 extends A2 {
	int j = 4;

	void m2() {
		System.out.println("inside m2");
	}
}

class C2 extends A2 {
	int k = 7;

	void m3() {
		System.out.println("inside m3");
	}
}

public class RunHierarchicalInheritance {
	public static void main(String[] args) {
		A2 objA = new A2();
		objA.m1();
		System.out.println(objA.i);
		System.out.println("***********************");
		B2 objB = new B2();
		objB.m2();
		objB.m1();
		System.out.println(objB.i);
		System.out.println(objB.j);
		System.out.println("***********************");
		C2 objC = new C2();
		objC.m3();
		objC.m1();
		System.out.println(objC.k);
		System.out.println(objC.i);
	}
}
