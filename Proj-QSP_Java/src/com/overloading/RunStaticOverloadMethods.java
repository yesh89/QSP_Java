package com.overloading;

class AddOne {
	public static int add(int i, int j) {
		return i + j;
	}

	public static double add(int i, double j) {
		return i + j;
	}

	public static double add(double i, double j) {
		return i + j;
	}

	public static double add(double i, int j) {
		return i + j;
	}
}

public class RunStaticOverloadMethods {
	public static void main(String[] args) {
		AddOne obj = new AddOne();
		int res1=obj.add(99, 33);
		System.out.println(res1);
		double res2=obj.add(9.99, 33);
		System.out.println(res2);
		double res3=obj.add(10.203, 4.302);
		System.out.println(res3);
		double res4 = obj.add(77, 36.98);
		System.out.println(res4);
	}
}
