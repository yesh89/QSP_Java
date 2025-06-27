package com.casting;
//Derived Casting - Auto Upcast
class A2 {
	int i = 8;
}

class B2 extends A2 {
	int j = 6;
}

public class Run2 {
	public static void main(String[] args) {
		A2 obj1 = new A2();
		System.out.println(obj1.i);

		B2 obj2 = new B2();
		System.out.println(obj2.i + " " + obj2.j);

		A2 objA = new B2(); //Auto upcast
		System.out.println(objA.i);
	}
}
