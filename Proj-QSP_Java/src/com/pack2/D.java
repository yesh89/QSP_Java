package com.pack2;

import com.pack1.A;

public class D extends A {
	public static void main(String[] args) {
		System.out.println("program starts");
		A objA = new A();
		System.out.println(objA.x);
		System.out.println("program ends");
	}
}
