package com.casting;

class Addition {
	int adding(double a, int b) {
		return (int) (a + b);
	}
}

public class Run1 {
	public static void main(String[] args) {
		System.out.println("program starts");
		Addition add = new Addition();
		double res = add.adding(3.0, (int) 5.5); //Widening and Narrowing
		System.out.println(res);
		System.out.println("program ends");
	}
}
