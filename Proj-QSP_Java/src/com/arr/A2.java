package com.arr;

public class A2 {
	public static void main(String[] args) {
		int arr[] = { 3, 9, 2, 4, 1, 7, 6 };
		int total = 0;
		int size = arr.length;
		// Sum of all the elements of the array
		System.out.println("Sum of all the elements of the array : ");
		for (int i = 0; i < size; i++) {
			total = total + arr[i];
		}
		System.out.println(total);
		// Maximum of all the array elements
		System.out.println("Maximum element in the array");
		int max = 0;
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
