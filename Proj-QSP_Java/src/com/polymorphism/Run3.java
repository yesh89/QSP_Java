package com.polymorphism;
//Object can be taken as an argument for a method

//runtime polymorphism using downcasting

class A3 {
	public void m1() {
		System.out.println("inside m1 method of class A3");
	}
}

class B3 extends A3 {
	public void m2() {
		System.out.println("inside m2 methid of class B3 ");
	}
}

class Sample3 {
	public static void demo(A3 refVar) // A3 refVar = new B3(); --upcasting
	{
		B3 refVarB = (B3) refVar;
		refVarB.m1();
		refVarB.m2();
	}
}

public class Run3 {
	public static void main(String[] args) {
		System.out.println("program starts");
		Sample3.demo(new B3());
		System.out.println("program ends");
	}

}
