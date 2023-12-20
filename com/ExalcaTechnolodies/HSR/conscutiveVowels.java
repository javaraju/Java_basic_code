package com.ExalcaTechnolodies.HSR;

import java.util.ArrayList;

public class conscutiveVowels {
	 public static void main(String[] args) {
		
		 int arr[]= {0,0,1,1,0,0,0,1,0,0,1,1,1,0};
		 int count=1;
		 int index=0;
		 int realcount=0;
	      for(int i=1;i<arr.length;i++)
	      {
	    	  if(arr[i-1]==1)
	    	  {
	    	     
	    	     if(arr[i-1]==arr[i])
	    	     {
	    	    	 count++;
	    	    	 index=i+2;
	    	     }
	    	     else
	    	     {
	    	    	 if(realcount<count)
	    	    	 {
	    	    		 realcount=count;
	    	    	 }
	    	    	 count=1;
	    	     }
	          }
	    	  
	      }
	     if(realcount<count)
	    	 realcount=count;
	     System.out.println("occurence:"+realcount);
	     System.out.println("starting index: "+(index-realcount));
	     
	 }
}

	            
