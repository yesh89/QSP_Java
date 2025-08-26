package com.obj.str;

public class A6 {
	public static void main(String[] args) {
		A6 obj1 = new A6();
		A6 obj2 = obj1;
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
	}
}
