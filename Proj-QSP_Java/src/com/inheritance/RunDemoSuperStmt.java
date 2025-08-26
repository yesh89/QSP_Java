package com.inheritance;

class A5 {
	A5() {
		System.out.println("Inside A class constructor w/o args");
	}
}

class B5 extends A5 {
	B5(int i) {
		System.out.println("Inside B class constructor with args");
	}
}

class C5 extends B5 {
	C5() {
		super(9);
		System.out.println("Inside C class constructor w/o args ");
	}
}

public class RunDemoSuperStmt {
	public static void main(String[] args) {
		C5 objC = new C5();
	}
}
