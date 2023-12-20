package com.huawei.test;

public class MaxReapeatingNumber {

	
   /* static char maxRepeatedChar(String str)
    {
    	int x=256;
        int arr[]=new int[x];
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            arr[str.charAt(i)]++;
        }
        int max=0; 
        char result=' ';
        for(int i=0; i<len;i++)
        {
            if (max<arr[str.charAt(i)])
            {
                max=arr[str.charAt(i)];
                result=str.charAt(i);
            }
        }
       return result;
    }*/
    public static void main(String[] args)
    {
        String str="ranjibbbbtaraju";
        /*System.out.println("Max occurring character is: " +
        		maxRepeatedChar(str));*/
        for(int i=0;i<str.length();i++)
        {
        	int count=0;
        	int max=0;
        
        	for(int j=0;j<str.length();j++)
        	{
        		if(str.charAt(i)==str.charAt(j))
        		{
        			count++;
        		}
        	}
        	if(count>max)
        	{
        		max=count;
        		System.out.println(str.charAt(i));
        		
        		
        	}
        		
        		
        		
        	
        }
    }
}
