package com.CollectionObjective.java;

import java.util.ArrayList;
import java.util.List;

public class CollectionObj2 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(10);
		list.add(10);
		System.out.println( list.size());
		list.remove(new Integer(10));
		System.out.println( list.size());

	}

}
//ArralyList can contain duplicate elements. 
//ArrayList remove() method only removes the first occurrence of a matching element.
