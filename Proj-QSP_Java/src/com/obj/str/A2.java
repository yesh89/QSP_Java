package com.obj.str;

//Overriding toStrin() method
public class A2 {
	
	
	@Override
	public String toString() {
		return "A2 [toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		System.out.println(new A2());
	}
}
