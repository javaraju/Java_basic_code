package com.collection.java;

import java.util.*;


public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.offer("raju");
		q.offer("soni");
		q.offer("Syamu");
		q.offer("Ranjita");
		q.offer("Ambuj");
		q.offer("Ambujrani");
		Object s=q.remove();
		Object s1=q.peek();
		Object s2=q.poll();
		Object s3=q.element();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(q);
		
		



	}

}
