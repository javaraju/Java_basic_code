package com.mountblue.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedArray {
 
	  static int solve(int[] a){
	        
	        int sum=0;
	        int count=0;
	        int suAll=0;
	        for(int i=0;i<a.length;i++)
	        {
	            
	            if(count<a.length/2)
	            {
	                sum=sum+a[i];
	                count++;
	            }
	            else{
	                suAll=suAll+a[i];
	            }
	        }
	        if(sum==suAll)
	        {
	            return 0;
	        }
	        else
	        {
	            
	            if(suAll-sum<0)
	            {
	                return -(suAll-sum);
	            }
	            else{
	                return (suAll-sum);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter even no of length:");
	        int n = in.nextInt();
	        int[] a = new int[n];
	        System.out.println("Enter the Array Element:");
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int result = solve(a);
	        System.out.println("Number of adding for"
	        		+ " Balancing the array is:- "+result);
	    }
	}


