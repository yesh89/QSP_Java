package com.constructor;

//Program to demo Constructor overloading

public class ClassA {
	int i;
	double j;

	ClassA() {
		System.out.println("inside no argument constructor");
	}

	ClassA(int a) {
		System.out.println("inside an integer argument constructor");
		i = a;
	}

	ClassA(double b) {
		System.out.println("inside a double argumnet constructor");
		j = b;
	}

	ClassA(int a, double b) {
		System.out.println("inside an int arg and double arg construcotr");
		i = a;
		j = b;
	}

	ClassA(double a, int b) {
		System.out.println("inside a double arg and int arg constructor");
		j = a;
		i = b;
	}

	public static void main(String[] args) {
		ClassA obj1 = new ClassA();
		System.out.println(obj1.i);
		System.out.println(obj1.j);

		ClassA obj2 = new ClassA(25);
		System.out.println(obj2.i);
		System.out.println(obj2.j);

		ClassA obj3 = new ClassA(99.889);
		System.out.println(obj3.i);
		System.out.println(obj3.j);

		ClassA obj4 = new ClassA(10, 36.86);
		System.out.println(obj4.i);
		System.out.println(obj4.j);

		ClassA obj5 = new ClassA(99.9819, 36);
		System.out.println(obj5.i);
		System.out.println(obj5.j);

	}
}
