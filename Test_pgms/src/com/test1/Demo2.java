package com.test1;

public class Demo2 {
	public static void main(String[] args) {
		int[] values; // array declaration
		values = new int[3];
		System.out.println(values[0]);
		System.out.println("**********************");
		values[0] = 10; // array initialization
		values[1] = 20;
		values[2] = 30;

		for (int i = 0; i < values.length; i++) {
			System.out.print(values[1] + "\t");
		}
		System.out.println();
		int[] numbers = { 4, 5, 9 }; // array initialization and declaration
		for (int x : numbers) {
			System.out.print(x + "\t");
		}
	}
}
