package com.DataStructure.java;

public class Runner1 {

	public static void main(String[] args) {
		Stack num=new Stack();
		System.out.println("isEmpty: "+num.isEmpty()+"\n");
		num.push(10);
		num.push(20);
		num.push(30);
		num.show();
		System.out.println("\n"+num.pop());
		System.out.println(num.peek());
		num.push(40);
		num.push(50);
		num.push(60);
		num.push(70);
		System.out.println("isEmpty: "+num.isEmpty());
		System.out.println("Size of Stack: "+num.size());
		num.show();
	}

}
