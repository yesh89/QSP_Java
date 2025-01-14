package com.basics;

public class EvenOdd {
	public static void main(String[] args) {
		int i = 100;
		while (i >= 1) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number ");
			} else {
				System.out.println((i + " is an odd number "));
			}
			i--;
		}
	}
}
