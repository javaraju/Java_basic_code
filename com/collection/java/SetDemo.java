package com.collection.java;
import java.util.HashSet;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("raja");
		hs.add("rani");
		hs.add("kahani");
		hs.add("jani");
		hs.add("sani");
		boolean b=hs.add("raja");
		System.out.println(hs);
		System.out.println(b);
		SortedSet ss=new TreeSet();
		ss.addAll(hs);
		System.out.println(ss);
		System.out.println(ss.first()+"....."+ss.last()+"......."+ss.headSet("kahani")
		+"...."+ss.tailSet("raja")+"..."+ss.subSet("kahani", "sani"));
		
	}

}
