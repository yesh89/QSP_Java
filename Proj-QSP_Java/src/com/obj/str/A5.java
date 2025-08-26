package com.obj.str;

public class A5 {

	int a = 10;

	public static void main(String[] args) {
		A5 obj1 = new A5();
		A5 obj2 = new A5();
		boolean b1 = obj1.equals(obj2);
		System.out.println(b1);

		boolean b2 = obj1 == obj2;
		System.out.println(b2);
	}
}
