package com.overloading;
//Method Overloading w.r.t Inheritance

class A {
	public void test() {
		System.out.println("Inside test method of A");
	}
}

class C extends A {
	public void test() {
		System.out.println("Inside test method of C");
	}
}

public class Btest {
	public static void main(String[] args) {
		A objA = new A();
		objA.test();
		C objC = new C();
		objC.test();
	}
}
