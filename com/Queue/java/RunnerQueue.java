package com.Queue.java;

public class RunnerQueue {

	public static void main(String[] args) {
		Queue q=new Queue();
		System.out.println(q.peek());
		System.out.println(q.element());
		q.offer(5);
		q.offer(6);
		q.offer(7);
		q.offer(8);
		q.offer(1);
		q.show();
		System.out.println(q.peek());//becouse FIFO.
		System.out.println(q.element());
		//System.out.println(q.poll());
		//q.show();
		

	}

}
