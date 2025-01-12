package com.basics;

public class Circle {
	public static double areaOfACircle(double r) {
		double area;
		area = 3.1416 * r * r;
		return area;
	}

	public static void main(String[] args) {
		System.out.println("Pogram starts here :");
		double res1 = areaOfACircle(0.5);
		System.out.println(res1);
		res1 = areaOfACircle(100);
		System.out.println(res1);
		res1 = areaOfACircle(25.5);
		System.out.println(res1);
		System.out.println("Program ends here : ");
	}
}
