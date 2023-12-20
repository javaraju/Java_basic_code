package com.stack.java;

public class RunnerDStack {
	public static void main(String[] args) {
		DStack s=new DStack();
		System.out.println("Stack is Empty: "+s.isEmpty());
		s.push(2);
		s.push(5);
		s.push(6);
		s.push(8);
		s.push(5);
		s.push(1);
		s.push(8);
		s.push(5);
		s.push(1);
		s.show();
		System.out.println("The size of stack is: "+s.size());
		System.out.println(s.pop());
		s.show();
		System.out.println(s.pop());
		s.show();
		System.out.println(s.pop());
		s.show();
		System.out.println(s.pop());
		s.show();
		System.out.println(s.pop());
		s.show();
		System.out.println("The size of stack is: "+s.size());
				

	}

}
