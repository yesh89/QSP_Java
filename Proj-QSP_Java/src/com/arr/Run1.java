package com.arr;

//Derived Array Or Object Array using Upcast
class A5 {
	int i = 5;
}

class B5 extends A5 {
	int j = 4;
}

public class Run1 {
	public static void main(String[] args) {
		A5 obj[] = new A5[3];
		obj[0] = new A5();
		obj[1] = new B5();
		obj[2] = new A5();
		for (A5 x : obj) {
			System.out.println(x);
		}
	}
}
