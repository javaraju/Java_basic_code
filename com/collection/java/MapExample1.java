package com.collection.java;
import java.util.Map;
import java.util.HashMap;
public class MapExample1 {

	public static void main(String[] args)
	{
		Map<String,String> hm=new HashMap<String,String>();
		hm.put("Roll no", "523");
		hm.put("Name", "Raju");
		hm.put("Address", "Bihar");
		System.out.println(hm);
		System.out.println("The value is name is:- "+hm.get("Name"));
		System.out.println("Map is Empty:- "+hm.isEmpty());
		hm.remove("Roll no");
		System.out.println(hm);
		System.out.println("The size of an Map:- "+hm.size());
		


	}

}
