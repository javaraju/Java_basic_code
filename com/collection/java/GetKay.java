package com.collection.java;

import java.util.HashMap;
import java.util.Set;

public class GetKay {

	public static void main(String[] args) 
	{
		HashMap<String,String> hp=new HashMap<String,String>();
		hp.put("raju", "Ranjita");
		hp.put("raj","Ragni");
		hp.put("Parveen","Ranjita");
		hp.put("Sunil","Alekhya");
		System.out.println(hp);
		Set<String> s=hp.keySet();
		System.out.println(s);
		for(String key:s)
		{
			System.out.println(key);
		}



	}

}
