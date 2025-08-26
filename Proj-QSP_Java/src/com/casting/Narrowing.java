package com.casting;

public class Narrowing {
	public static void main(String[] args) {
		double a = 99.99;
		int x = (int) a; //Narrowing
		System.out.println(a);
		System.out.println(x);
		
		double pi = 3.14;
		int y = (int)3.14;
		System.out.println(pi);
		System.out.println(y);
	}
}
