package com.polymorphism;
//Object can be taken as an argument for a method
//runtime polymorphism using upcasting
class A2 {
	public void m1() {
		System.out.println("inside m1 method of class A");
	}

}

class B2 extends A2 {
	public void m2() {
		System.out.println("inside m2 method of class B");
	}
}

class Sample2 {
	public static void demo(A2 refVar) { // A2 refVar = new B2();
		refVar.m1();
//		reVar.m2();
	}
}

public class Run2 {
	public static void main(String[] args) {
		System.out.println("program starts");
		Sample2.demo(new B2());
		System.out.println("program ends");
	}
}
