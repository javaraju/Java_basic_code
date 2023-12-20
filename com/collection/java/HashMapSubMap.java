package com.collection.java;
import java.util.HashMap;
public class HashMapSubMap {

	public static void main(String[] args)
	{
		HashMap<String,Integer> hp=new HashMap<String,Integer>();
		hp.put("Raju", 523);
		hp.put("Ambuj",111);
		hp.put("Ragni",222);
		hp.put("Khushi",333);
		System.out.println(hp);
		HashMap<String,Integer> hp1=new HashMap<String,Integer>();
		hp1.put("Alekhya", 501);
		hp1.put("Ranjita",999);
		System.out.println(hp1);
		hp1.putAll(hp);
		System.out.println(hp1);


		

	}

}
