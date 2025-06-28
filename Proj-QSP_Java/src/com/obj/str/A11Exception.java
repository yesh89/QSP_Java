package com.obj.str;

public class A11Exception {
	public static void main(String[] args) {
		System.out.println("Program starts here ");
		try {
			System.out.println("Inside try block");
			int i = 10;
			int res = i / 0;
		} catch (Exception ae) {
			System.out.println("Inside catch block");
			ae.getCause();
			System.out.println(ae.getMessage());
			 ae.getStackTrace();
		} finally {
			System.out.println("test exception finally block");
		}
		System.out.println("Program ends here ");
	}
}
