package com.collection.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {

	public static void main(String[] args)
	{
		HashMap<String,String> hp=new HashMap<String,String>();
		hp.put("raju", "Ranjita");
		hp.put("raj","Ragni");
		hp.put("Parveen","Ranjita");
		hp.put("Sunil","Alekhya");
		System.out.println(hp);
		Set<Entry<String,String>> entrys=hp.entrySet();
		System.out.println(entrys);
		for(Entry<String,String> entry:entrys)
		{
			System.out.println(entry.getKey()+" ==> "+entry.getValue());
		}


	}

}
