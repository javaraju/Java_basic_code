package com.mountblue.java;
import java.util.Map;
import java.util.HashMap;
public class ElectionWinner {
	public static String findWinner(String[] s)
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(String str:s)
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
		for(Map.Entry<String,Integer>  e:m.entrySet())
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
		      System.out.println(findWinner(votes));
		 }

}
