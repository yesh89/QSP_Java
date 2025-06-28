package com.arr;

public class Run2 {
	public static void main(String[] args) {
		Object objArr[] = new Object[4];
		objArr[0] = new Object();
		objArr[1] = new Object();
		objArr[2] = new Object();
		objArr[3] = new Object();
		for (Object x : objArr) {
			System.out.println(x);
		}
	}
}
