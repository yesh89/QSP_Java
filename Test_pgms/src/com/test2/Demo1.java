package com.test2;

public class Demo1 {

	public static void main(String[] args) {
		calculate(4);
	}

	private static void calculate(int value) {
		System.out.println(value);
		if (value == 1) {
			return;
		}
		calculate(value - 1);
	}
}
