package com.polymorphism;

//Object can be taken as an argument for a method
//runtime polymorphism using inheritance

class A1 {
	public void m1() {
		System.out.println("inside m1 method of class A1");
	}
}

class B1 extends A1 {
	public void m2() {
		System.out.println("inside m2 method of class B1");
	}
}

class Sample1 {
	static void demo(B1 refvar) { // B1 refvar = new B()
		refvar.m1();
		refvar.m2();
	}
}

public class Run1 {
	public static void main(String[] args) {
		System.out.println("program starts");
		Sample1.demo(new B1());
		System.out.println("program ends");
	}
}
