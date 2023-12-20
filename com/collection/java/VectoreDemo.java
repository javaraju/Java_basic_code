package com.collection.java;
import java.util.Vector;
public class VectoreDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(5);
		v.add(6);
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(5,"Raju");
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
		v.removeElementAt(0);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.elementAt(10));
		
		
			}
	

}
