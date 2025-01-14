package com.basics;

public class A5 {
	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Grade not Good");
		}
	}
}
