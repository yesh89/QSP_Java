package com.test2;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	private static int factorial(int number) {
		if (number == 1) {
			return 1;
		}
		return factorial(number - 1) * number;
	}
}
