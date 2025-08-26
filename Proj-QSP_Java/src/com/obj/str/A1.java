package com.obj.str;

public class A1 {
	int i = 9;

	public static void main(String[] args) {
		A1 objA1 = new A1();
		String str1 = objA1.toString();
		System.out.println(str1);

		A1 objB1 = new A1();
		String str2 = objB1.toString();
		System.out.println(str2);
	}
}
