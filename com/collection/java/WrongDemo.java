package com.collection.java;

import java.util.Comparator;
import java.util.TreeMap;

public class WrongDemo {

	
	public static void main(String[] args) {
		TreeMap<String , String> tm=new TreeMap<>(new MyC());

		tm.put("Helllo", "chotu");
		tm.put("chotu", "motu");
		System.out.println(tm);
	}

}
class MyC implements Comparator <String>
{

	public int compare(String o1, String o2) {
		
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
	
}
