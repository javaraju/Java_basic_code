package com.reimpliment.java;
import java.util.*;
public class DuplicateStringDemo {

	public static void main(String[] args) {
		String[] str=new String[] {"raju","ranjita","ambuj","rani","raju","ranjita","ragni"};
		Set duplicateSet=new HashSet<>();
		Set nonDuplicateSet=new HashSet<>();
		for(String c:str) {
			if(!nonDuplicateSet.contains(c))
			{
				nonDuplicateSet.add(c);
			}
			else
			{
				duplicateSet.add(c);
			}
			
		}
		System.out.println(duplicateSet);
		//System.out.println(nonDuplicateSet);

	}

}
