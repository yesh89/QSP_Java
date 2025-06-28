package com.pack1;

public class A {
	public int x = 5;
	private int i = 2;

	public static void main(String[] args) {
		System.out.println("Program starts");
		A objA = new A();
		System.out.println(objA.x);
		System.out.println(objA.i);
		System.out.println("Program ends");
	}
}
