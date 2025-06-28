package com.arr;

public class A4 {
	public static void main(String[] args) {
//		A4[] objA = new A4[3];
		A4 objArr[] = new A4[3];

		objArr[0] = new A4();
		objArr[1] = new A4();
		objArr[2] = new A4();
		for (A4 x : objArr) {
			System.out.println(x);
		}
	}
}
