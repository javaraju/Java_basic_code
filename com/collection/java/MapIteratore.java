package com.collection.java;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class MapIteratore {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>
();
	hm.put("Love", "Raju");
	hm.put("hate","Ranjita");
	hm.put("sexy","Ambuj");
	hm.put("Friend","Ragni");
	Set<String> s=hm.keySet();
	System.out.println(s);
	for(String key:s)
	{
		System.out.println("Value of "+key+ " is: "+hm.get(key));
	}
	}

}
