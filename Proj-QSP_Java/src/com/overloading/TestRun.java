package com.overloading;

//method overriding w.r.t multi-level Inheritance 

class A1 {
	public void test() {
		System.out.println("Inside test method of class A1");
	}

}

class B1 extends A1 {
	public void test() {
		System.out.println("Inside test method of class B1");
	}

}

class C1 extends B1 {
	public void test() {
		System.out.println("Inside test method of class C1");
	}
}

public class TestRun {
	public static void main(String[] args) {
		A1 objA1 = new A1();
		objA1.test();
		B1 objB1 = new B1();
		objB1.test();
		C1 objC1 = new C1();
		objC1.test();
	}
}
