package com.overloading;

class Addition {
	int add(int a, int b) {
		int res = a + b;
		return res;
	}

	double add(int a, double b) {
		double res = a + b;
		return res;
	}

	double add(double a, double b) {
		double res = a + b;
		return res;
	}

	double add(double a, int b) {
		double res = a + b;
		return res;
	}

}

public class Run {
	public static void main(String[] args) {
		Addition objAdd = new Addition();
		int res1 = objAdd.add(10, 30);
		System.out.println(res1);
		double res2 = objAdd.add(30.232, 23);
		System.out.println(res2);
		double res3 = objAdd.add(22.54, 56.92);
		System.out.println(res3);
		double res4 = objAdd.add(60, 23.1332);
		System.out.println(res4);
	}
}
