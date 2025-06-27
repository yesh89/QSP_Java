package com.testAbsInterface;

interface A5 {
	void m1();

	void m2();

	int i = 9;
	int j = 20;
}

class B5 implements A5 {

	@Override
	public void m1() {
		System.out.println("Inside m1 method");

	}

	@Override
	public void m2() {
		System.out.println("Inside m2 method");
	}

	public void add() {
//		i=99;
		int res = i + j;
		System.out.println(res);
	}
}

public class Run4 {
	public static void main(String[] args) {
		B5 objB = new B5();
		objB.m1();
		objB.m2();
		objB.add();
	}
}
