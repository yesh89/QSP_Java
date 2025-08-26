package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class A {
	int i = 9;
}

public class ListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(2);
		al.add(4.5);
		al.add(true);
		al.add(true);
		al.add(null);
		al.add(4.5);
		al.add("Selenium");
		al.add(new A());

		int n = al.size();
		System.out.println("Size of ArrayList is : " + n);

		// printing contents of an array using traditional for loop
		for (int i = 0; i < n; i++) {
			System.out.println(al.get(i));
		}

		System.out.println("***************************************");
		System.out.println("Using enhanced for loop");
		for (Object x : al) {
			System.out.println(x);
		}
		System.out.println("***************************************");
		System.out.println("Using ierator method");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
