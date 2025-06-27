package com.casting;
//Derived Casting - Auto Upcast w.r.t MultiLevel Inheritance
class A4 {
	int i = 4;
}

class B4 extends A4 {

	int j = 5;
}

class C4 extends B4 {
	int k = 9;
}

public class Run4 {
	public static void main(String[] args) {
		A4 objA1 = new B4();
		System.out.println(objA1.i);
		System.out.println("***************************************");

		B4 objB1 = new C4();
		System.out.println(objB1.i);
		System.out.println(objB1.j);

		System.out.println("***************************************");
		A4 objA2 = new C4();
		System.out.println(objA2.i);

	}
}
