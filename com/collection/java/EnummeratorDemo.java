package com.collection.java;
import java.util.Enumeration;
import java.util.Vector;
public class EnummeratorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("raju");
		v.add("vikash");
		v.add("babblu");
		v.add("sumit");
		v.add("rakesh");
		Enumeration<String> em=v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}


	}

}
