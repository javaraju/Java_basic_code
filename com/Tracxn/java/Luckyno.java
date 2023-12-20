package com.Tracxn.java;

import java.util.Iterator;
import java.util.LinkedList;

public class Luckyno {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		int n=63;
		int size=0;
		for (int i = 1; i <=n; i+=2) 
		{
			ll.add(i);
		}
		System.out.println(ll);
		
		for(int i=1;i<ll.size();i++)
		{
			int r=(int)ll.get(i);
			for(int j=r-1;j<ll.size();j+=(r-1))
			{
				ll.remove(j);
			}
		if(ll.size()!=size)
		{
			System.out.println(r+" "+ll);
			size=ll.size();
		}
		else
			break;
			
		}
		
	}

}
