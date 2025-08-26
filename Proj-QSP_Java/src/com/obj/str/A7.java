package com.obj.str;

public class A7 {
	public static void main(String[] args) {
		String str = "Rama";
		System.out.println(str.toString());

		System.out.println(str);

		String str1 = new String("Rama");
		String str2 = "Rama";

		System.out.println(str1.equals(str2)); //Based on the String value
		System.out.println(str1 == str2);     //Based on Address
	}
}
