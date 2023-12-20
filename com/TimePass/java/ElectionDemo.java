package com.TimePass.java;

import java.util.HashMap;
import java.util.Map;

public class ElectionDemo {
	public static String fun(String[] v)
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(String str:v)
		{
			if(m.keySet().contains(str))
			{
				m.put(str, m.get(str)+1);
			}
			else
			{
				m.put(str, 1);
			}
		}
		int maxVal=0;
		String winner="";
		for(Map.Entry<String, Integer> e:m.entrySet())
		{
			String key=e.getKey();
			int val=e.getValue();
			if(val>maxVal)
			{
				maxVal=val;
				winner=key;
			}
			else if(val==maxVal&&winner.compareTo(key)>0)
			{
				winner=key;
			}
		}
		return winner;
	}

	public static void main(String[] args) {
		String[] votes = { "john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john" };
		String s=fun(votes);
		System.out.println(s);

	}

}
