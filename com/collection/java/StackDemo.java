package com.collection.java;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack sk=new Stack();
		sk.push("rani");
		sk.push("Raja");
		sk.push("Syam");
		System.out.println(sk);
		System.out.println(sk.pop());
		System.out.println(sk);
		System.out.println(sk.peek());
		System.out.println(sk);
		System.out.println(sk.isEmpty());
		System.out.println(sk.search("rani"));
		
	}

}
