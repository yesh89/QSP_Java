package com.basics;

public class Add {
	static int addTwoNum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Program starts here : ");
		int res1 = addTwoNum(10, 20);
		System.out.println(res1);
		int res2 = addTwoNum(300, 400);
		System.out.println(res2);
		int res3 = addTwoNum(1000, 2000);
		System.out.println(res3);
		System.out.println("Program ends here :");
	}
}
