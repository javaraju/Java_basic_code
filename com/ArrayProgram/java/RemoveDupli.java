package com.ArrayProgram.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupli {

	public static void main(String[] args) {
				int arr[]= {10,20,10,60,10,60,80,40,45,60,80};
				Set<Integer> s=new HashSet<Integer>();
				for(int i=0;i<arr.length-1;i++)
				{
				    if(!s.contains(arr[i]))
					{
					 s.add(arr[i]);
					}
				
				}
				System.out.println(s);
				
				
				
				/*String s="";
				for(int i=0;i<arr.length;i++)
				{
					if(s.contains(" "+arr[i]))
					{
						continue;
					}
					else
					{
						s=s+" "+arr[i];
					}
				}
				System.out.println(s);*/
	    }

}
