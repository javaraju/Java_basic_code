package com.EnlightenSoft.java;

public class UdayBhaiQuestion {

	public static void main(String[] args) {
		int start=5;
		
		int end=10;
		String[] str= {"one","two","three","four","five","six","seven",
				        "eight","nine","ten","eleven","twelve","thirteen",
				        "fourteen","fifteen",
				        "sixteen","eighteen","ninteen"};
		String []str2={"one","two","three","four","five","six","seven",
		        "eight","nine"};
				        
	    String[] str1= {"twenty","thirty","fourty","fifty",
				        "sisty","seventy","eighty","ninty","hundread"};
		for(int i=start;i<=end;i++)
		{
			if(i<=end)
			{
				System.out.println(str[i-1]);
			}
		}
		if(start>=20)
		{
			
	  for(int i=0;i<str1.length;i++)
		{
		  for(int j=0;j<str2.length;j++)
		  {
			  if(i>=20)
			  {
				  System.out.println();
			  }
		  }
			
		}
		}

	}

}
