package com.obj.str;

public class A9 {
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = new String("Developer");
		System.out.println(str1.indexOf('v'));
		System.out.println(str2.charAt(5));
		System.out.println(str2.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str2.substring(6));
		System.out.println(str2.substring(1, 5));
		System.out.println(str2.substring(8));
		System.out.println(str2.length());
		System.out.println(str1.concat(str2));
	}
}
