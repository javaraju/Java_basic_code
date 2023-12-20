package com.CollectionObjective.java;

import java.util.PriorityQueue;

public class Obj3 {

	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("Apple");
        pQueue.add("Samsung");
        pQueue.add("Nokia");
        pQueue.add("Apple");
        //System.out.println(pQueue);
        
        System.out.print(pQueue.poll()+ " " + pQueue.poll());
        //System.out.println(pQueue);
        System.out.print(" " + pQueue.peek() + " " + pQueue.poll());
    }

}
//Note:-PriorityQueue keeps elements sorted and it 
//can have duplicates.

//add() and offer() methods both offer same functionality.

//poll() method removes the first element in queue and returns it,
//while peek() method returns the first element without removing it.
