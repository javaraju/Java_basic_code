package com.importantcode.java;
import java.util.*;
public class DuplicateStrinngDemo {

	public static void main(String[] args) {
		String[] str=new String[] {"Raju","Ranjita","Ranjita","Parveen","Ambuj","Raju"};
		Set nonDuplicateSet=new HashSet();
		Set duplicateSet=new HashSet();
		for(String s:str)
		{
			if(!nonDuplicateSet.contains(s))
			{
				nonDuplicateSet.add(s);
			}
			else
			{
				duplicateSet.add(s);
			}
		}
		System.out.println(duplicateSet);
		}

}
