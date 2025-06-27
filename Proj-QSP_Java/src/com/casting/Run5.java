package com.casting;

//Derived Casting - Explicit Downcast

class A {
	int i = 9;

	void m1() {
		System.out.println("Inside m1 method");
	}
}

class B extends A {
	int j = 6;

	void m2() {
		System.out.println("inside m2 method");
	}
}

public class Run5 {
	public static void main(String[] args) {
		A objA = new B(); // upcast
		System.out.println("***************************************");
		System.out.println(objA.i);
		objA.m1();
		System.out.println("***************************************");
		B objB = (B) objA; // downcast
		System.out.println(objB.i);
		System.out.println(objB.j);
		objB.m1();
		objB.m2();

	}

}
