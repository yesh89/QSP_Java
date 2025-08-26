package com.pack2;

public class B {
	public static void main(String[] args) {
		System.out.println("program starts");
		com.pack1.A objA1 = new com.pack1.A();
		System.out.println(objA1.x);
//		System.out.println(objA1.i);    ---> Private member cannot be accessed
		System.out.println("program ends");
	}
}
