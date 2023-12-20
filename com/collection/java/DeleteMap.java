package com.collection.java;

import java.util.HashMap;

public class DeleteMap {

	public static void main(String[] args) {

		HashMap<String,String> hp=new HashMap<String,String>();
		hp.put("raju", "Ranjita");
		hp.put("raj","Ragni");
		hp.put("Parveen","Ranjita");
		hp.put("Sunil","Alekhya");
		System.out.println(hp);
		hp.clear();
		System.out.println(hp);

	}

}
