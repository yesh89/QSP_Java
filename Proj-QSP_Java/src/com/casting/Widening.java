package com.casting;

public class Widening {
	public static void main(String[] args) {
		int i = 4;
		double j = i; //Widening
		System.out.println(j);
		
		int x = 7;
		double s = (double)x; //Widening
		System.out.println(x);
		System.out.println(s);
	}
}
