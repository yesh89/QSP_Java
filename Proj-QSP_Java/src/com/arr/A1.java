package com.arr;

//Demo of a Single Dimensional array

public class A1 {
	public static void main(String[] args) {
//		int []arr = new int[5]; -- This is also correct declaration

		int arr[] = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// Printing array element using traditional for loop
		int arrSize = arr.length;
		for (int i = 0; i < arrSize; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		// Printing array element using Enhanced for loop
		for (int x : arr) {
			System.out.print(x + "\t");
		}
		System.out.println();
	}
}
