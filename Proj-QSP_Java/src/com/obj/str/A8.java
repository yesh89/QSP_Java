package com.obj.str;

public class A8 {
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		String str3 = "java";
		String str4 = "java";
		String str5 = "Java";

		System.out.println(str1 == str2);
		System.out.println(str3.equalsIgnoreCase(str5));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str5));
		System.out.println(str3 == str5);
		System.out.println(str3 == str4);
	}
}
