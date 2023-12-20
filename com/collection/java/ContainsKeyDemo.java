package com.collection.java;
import java.util.HashMap;
public class ContainsKeyDemo {

	public static void main(String[] args)
	{
		HashMap<String,String> hp=new HashMap<String,String>();
		hp.put("raju", "Ranjita");
		hp.put("raj","Ragni");
		hp.put("Parveen","Ranjita");
		hp.put("Sunil","Alekhya");
		System.out.println(hp);
		if(hp.containsKey("Parveen"))
		{
		System.out.println("contains");
		}
		else
		{
			System.out.println("not contains");
		}
		if(hp.containsKey("Jaan"))
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("Not Contains");
		}
		if(hp.containsValue("Ranjita"))
		{
			System.out.println("It contains");
		}
		else
		{
			System.out.println("Not contains");
		}
	}

    

}
