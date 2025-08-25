package com.test1;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Kindly Enter a text : ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped");
			break;
		default:
			System.out.println("Invalid text");
		}
	}
}
