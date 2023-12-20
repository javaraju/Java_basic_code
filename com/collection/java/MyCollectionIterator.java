package com.collection.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class MyCollectionIterator {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Ram");
		l.add("Shyam");
		l.add("Raju");
		l.add("Rama");
		l.add("Jaan");
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String str1=itr.next();
			System.out.println(str1);
		}
	}

}
