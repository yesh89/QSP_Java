package com.collections;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(4);
		hs.add(4);
		hs.add(4.9);
		hs.add(1000);
		hs.add(true);
		hs.add(null);
		hs.add("test");
		
		for(Object o :hs) {
			System.out.println(o);
		}
	}
}
