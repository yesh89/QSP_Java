package com.test1;

//Array of strings
public class Demo3 {
	public static void main(String[] args) {
		String[] words = new String[3];
		words[0] = "hello";
		words[1] = "to";
		words[2] = "you";
		System.out.println(words[2]);
		String[] fruits = { "apple", "mango", "banana", "jackfruit" };
		for (String fruit : fruits) {
			System.out.print(fruit + "\t");
		}
		System.out.println();
		System.out.println("**********************");

		int value = 0;
		String text = null;
		String[] texts = new String[2];
		System.out.println(texts[0]);
		texts[0]="one";
	}
}
