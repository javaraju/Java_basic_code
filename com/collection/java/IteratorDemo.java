package com.collection.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {

	public static void main(String[] args) {
		
		String s="saju";
		List<String> l=new ArrayList<>();
		l.add("raja");
		l.add("saju");
		l.add("jani");
		l.add("naja");
		l.add("kaja");
		System.out.println(l);
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String str1=itr.next();
			System.out.println(str1);
			if(s.equals(str1))
				itr.remove();
			
		}
		System.out.println("After removel");
		System.out.println(l);
		
		
	}

}
