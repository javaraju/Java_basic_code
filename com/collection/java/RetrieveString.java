package com.collection.java;

import java.util.ArrayList;

public class RetrieveString {
	
	String name;
	int id,salary;
	public RetrieveString(String name , int id ,int salary)
	{
	this.name = name;
	this.id = id;
	this.salary = salary;
	}
	public String toString()
	{
		return " "+salary;
	}

	
	
	
	public static void main(String[] args) {

		
		    ArrayList<RetrieveString> arrayList=new ArrayList<RetrieveString>();
		    RetrieveString a = new RetrieveString("java",1,15000);
		    RetrieveString b = new RetrieveString("vava",3,40000);
		    RetrieveString c = new RetrieveString("javadd",2,10000);
		    RetrieveString d = new RetrieveString("vavaja",4,20000);

		    
		        arrayList.add(a);
		        arrayList.add(b);
		       arrayList.add(c);
		        arrayList.add(d);
		        System.out.println(arrayList.toString());
		        

		        

		}
	}


