package com.test1;

public class Demo5 {
	public static void main(String[] args) {

		// Insufficient
		String info = " ";
		info += "My name is bob";
		info += " ";
		info += "I am a builder";
		System.out.println(info);
		System.out.println();

		// More efficient
		StringBuilder sb = new StringBuilder();
		sb.append("My name is June.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		StringBuffer sb1 = new StringBuffer();
		sb1.append("My name is May");
		sb1.append(" ");
		sb1.append("I am a Sky Diver");
		System.out.println(sb1.toString());
	}
}
