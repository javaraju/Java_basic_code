package com.hackerrank.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ArrayLeftRotate {

	public static void main(String[] args) {

		
		
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter value of n and k");
		        int n = in.nextInt();
		        int k = in.nextInt();
		        int a[] = new int[n];
		        System.out.println("Enter Element af an Array");
		        for(int a_i=0; a_i < n; a_i++){
		            a[a_i] = in.nextInt();
		             
		        }
		         int[] rotated = new int[n];
		        //int b=0;
		        for(int i=0; i < n; i++){
		        	 rotated[(i+n-k) % n] = a[i];
		            //rotated[++b]=a[i];
		            //if(b==n-1)
		            /*{
		                b=-1;
		            }*/
		        }

		        for(int i=0; i < n; i++){
		            System.out.print(rotated[i] + " ");
		        }
		        
		   

	}

}
