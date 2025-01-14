package com.basics;

public class A4 {
	public static void main(String[] args) {
		int phoneInterviewRd = 5;
		int techInterviewRd = 4;
		if (phoneInterviewRd == 5) {
			if (techInterviewRd == 5) {
				System.out.println("Candidate selected");
			} else {
				System.out.println("Candidate not good in technical");
			}
		} else {
			System.out.println("Better luck next time!");
		}
	}
}
