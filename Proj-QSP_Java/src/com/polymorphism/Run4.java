package com.polymorphism;
//Object can be taken as an argument for a method

//runtime polymorphism using upcasting for a overridden method in a multi level inheritance
class A4 {
	public void m1() {
		System.out.println("insice m1 method of class A");
	}
}

class B4 extends A4 {
	public void m1() {
		System.out.println("inside m1 method of class B");
	}
}

class C4 extends B4 {
	public void m1() {
		System.out.println("inside m1 method of clas C");
	}
}

class Sample4 {
	public static void demo(A4 refVar) {
		refVar.m1();
	}
}

public class Run4 {
	public static void main(String[] args) {
		System.out.println("program starts");
		Sample4.demo(new A4());
		System.out.println("*******************************");
		Sample4.demo(new B4());
		System.out.println("*******************************");
		Sample4.demo(new C4());
		System.out.println("*******************************");
		System.out.println("program ends");
	}
}
