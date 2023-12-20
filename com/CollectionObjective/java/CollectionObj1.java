package com.CollectionObjective.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionObj1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Integer[] i= {2,3,4};
		list=Arrays.asList(i);
		System.out.println(list);
		list.set(0, 100);
		System.out.println(list);
		list.add(10);
		System.out.println(list);

	}

}
//Note:-
//Arrays.asList() returns a fixed-size list backed by the specified array. Therefore, the arraylist can't grow.
//So, when add() is called, an exception is thrown.
