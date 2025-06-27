package com.casting;
//Auto upcast w.r.t data members & member methods

class A3 {
	int i = 6;

	public void m1() {
		System.out.println("Inside m1 methods");
	}
}

class B3 extends A3 {
	int j = 9;

	public void m2() {
		System.out.println("Inside m2 methods");
	}
}

public class Run3 {
	public static void main(String[] args) {
		A3 objA = new B3();
		System.out.println(objA.i);
		objA.m1();
		System.out.println("***************************************");
		A3 obj1 = new A3();
		System.out.println(obj1.i);
		obj1.m1();
		B3 obj2 = new B3();
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		obj2.m1();
		obj2.m2();
	}

}
