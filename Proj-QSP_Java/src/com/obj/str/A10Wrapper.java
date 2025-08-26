package com.obj.str;

import java.util.Scanner;

public class A10Wrapper {
	public static void main(String[] args) {
		int i = 5;
		@SuppressWarnings("removal")
		Integer intObj1 = new Integer(i); // Auto boxing
		System.out.println(intObj1);

		int j = (int) intObj1;

		System.out.println(j); // Unboxing

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Entered number is  : " + num);

		System.out.println("Enter your Name : ");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();
		System.out.println("Enter your age : ");
		Scanner sc2 = new Scanner(System.in);
		int age = sc2.nextInt();

		System.out.println("Name : " + name + "\nAge : " + age);

	}
}
