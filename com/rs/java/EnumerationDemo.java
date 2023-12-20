package com.rs.java;

import java.util.*;
public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
			System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer ir=(Integer)e.nextElement();
			if(ir%2==0)
				System.out.println(ir);
		}
		System.out.println(v);
	
	}

}
