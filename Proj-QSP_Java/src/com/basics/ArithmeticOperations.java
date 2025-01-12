package com.basics;

public class ArithmeticOperations {

	public static int addition(int a, int b) {
		int res = a + b;
		return res;
	}

	public static int subtraction(int a, int b) {
		int res = a - b;
		return res;
	}

	public static int multiplication(int a, int b) {
		int res = a * b;
		return res;
	}

	public static int division(int a, int b) {
		int res = a / b;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts here");
		int add = addition(1010, 2010);
		System.out.println(add);
		int sub = subtraction(230, 123);
		System.out.println(sub);
		int multiply = multiplication(209, 108);
		System.out.println(multiply);
		int divide = division(989, 9);
		System.out.println(divide);
		System.out.println("Program ends here");
	}

}
