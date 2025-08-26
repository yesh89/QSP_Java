package com.inheritance;

class A4 {
	int i = 9;

	A4() {
		System.out.println("inside A class constructor");
	}
}

class B4 extends A4 {
	int j = 9;

	B4() {
		super();
		System.out.println("inside B class constructor");
	}
}

class C4 extends B4 {
	int k = 7;

	C4() {
		super();
		System.out.println("inside C class constructor");
	}
}

public class RunMultiLevel {
	public static void main(String[] args) {
		C4 objC = new C4();
	}
}
