package com.collection.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratoreDemo {

	public static void main(String[] args) {
		
	      List<Integer> lst=new ArrayList<>();
	      lst.add(25);
	      lst.add(12);
	      lst.add(55);
	      lst.add(66);
	      lst.add(10);
	      lst.add(77);
	      ListIterator<Integer> itr=lst.listIterator();
	      System.out.println("ArrayList in Forward direction");
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }
	      System.out.println("ArrayList in BackwardDirection");
	      while(itr.hasPrevious())
	      {
	    	  System.out.println(itr.previous());
	    	  
	      }

	}

}
