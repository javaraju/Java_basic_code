package com.collection.java;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("raju");
		l.add("Ranjita");
		l.add("Alekhya");
		l.add("Ragni");
		System.out.println(l);
		LinkedList ll=new LinkedList();
		ll.add("Ambuj");
		ll.add("jaan");
		//ll.addAll(l);
		ll.addFirst("Pappu");
		ll.addLast("Vikash");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);
		System.out.println(ll.contains("jaan"));
		System.out.println(ll.containsAll(l));
		System.out.println(l.containsAll(ll));
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
		}
		System.out.println(ll);
		System.out.println(ll);
		l.remove("Ragni");
		System.out.println(l);
		ll.addAll(1, l);
		System.out.println(ll);
		ll.removeAll(l);
		//System.out.println(ll);
		ll.retainAll(l);
		//System.out.println(ll);
		//l.clear();
		//System.out.println(l);
		boolean b=l.isEmpty();
		System.out.println(b);
		int i=l.size();
		System.out.println(i);
		System.out.println(ll.contains("jaan"));
		

	}

}
