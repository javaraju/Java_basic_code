package com.stack.java;

public class RunnerStack {

	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println("Stack is Empty: "+s.isEmpty());
		s.push(2);
		s.push(5);
		s.push(6);
		s.push(8);
		s.push(5);
		s.push(100000);
		s.show();
		System.out.println("The size of stack is: "+s.size());
		System.out.println("pop element is: "+s.pop());
		s.show();
		System.out.println("pop element is: "+s.pop());
		s.show();
		System.out.println("the peek is: "+s.peek());
		s.show();
		System.out.println("The size of stack is: "+s.size());
		System.out.println("Stack is Empty: "+s.isEmpty());		

	}

}
