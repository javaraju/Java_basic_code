package com.rs.java;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack sk=new Stack();
		sk.push(1);
		sk.push('b');
		sk.push('c');
		sk.push(2);
		System.out.println(sk);
		//System.out.println(sk.pop());
		//System.out.println(sk);
		System.out.println(sk.peek());
		System.out.println(sk);
		boolean bn=sk.isEmpty();
		System.out.println(bn);
		System.out.println(sk.search('c'));
		System.out.println(sk.search('2'));

	}

}
