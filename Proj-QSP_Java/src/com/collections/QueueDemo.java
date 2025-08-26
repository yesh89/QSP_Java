package com.collections;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>();
		pq.add(3);
		pq.add(4);
	
		pq.add(7);
		
	
		
		int n=pq.size();
		for (Object o : pq) {
			System.out.println(o);
		}
		System.out.println();
		System.out.println(pq.peek());
		pq.peek();
		
	}
}
