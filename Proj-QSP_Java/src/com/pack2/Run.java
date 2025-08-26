package com.pack2;

class E {
	protected void m1() {
		System.out.println("inside m1 of class E");
	}

	public void m2() {
		System.out.println("inside m2 of class E");
	}
}

class F extends E {

	public void m1() {
		super.m2();
		System.out.println("inside m1 of Clas F");
	}

}

public class Run {
	public static void main(String[] args) {
		E objE = new F();
		F objF = (F) objE;
		objF.m1();
		objF.m2();
	}
}
