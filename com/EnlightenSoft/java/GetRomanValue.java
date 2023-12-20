package com.EnlightenSoft.java;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class GetRomanValue {
	static String getRoman(int n)
	{
		String s="";
		Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		m.put(1000, "M");
		m.put(900, "CM");
		m.put(500, "D");
		m.put(400, "CD");
		m.put(100, "C");
		m.put(90, "XC");
		m.put(50, "L");
		m.put(40, "XL");
		m.put(10, "X");
		m.put(9, "IX");
		m.put(5, "V");
		m.put(4, "IV");
		m.put(1, "I");
		for(Map.Entry<Integer,String> entry:m.entrySet())
		{
			int key=entry.getKey();
			if(n/key!=0)
			{
				for(int i=0;i<(n/key);i++)
				{
				s=s+m.get(key);
				}
				n=n%key;
			}
		}
		return s;
	}
        public static void main(String[] args)
        {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer:");
		String r=getRoman(sc.nextInt());
		System.out.println(r);
   }

}
