package com.mountblue.java;

import java.util.Arrays;

public class UniqueArrayElementSum {
	 static int minSum(int arr[], int n)
	    {
	        int sum = arr[0];
	     for (int i = 1; i < n; i++) 
	        {
	            if (arr[i] == arr[i - 1])
	            {         
	            	int j = i;
	                while (j < n && arr[j] <= arr[j - 1]) 
	                {         
	                    arr[j] = arr[j] + 1;
	                    j++;
	                }
	            }
	            sum = sum + arr[i];
	        }
	       return sum;
	    }
	    public static void main (String[] args) 
	    {
	        int arr[] = { 3,2,1,2,4,7 };
	        Arrays.sort(arr);
	        int n = arr.length;
	        System.out.println(minSum(arr, n));
	 }
}
/*static int minSum(int arr[], int n)
{
    int sum = arr[0], prev = arr[0];
 
    for (int i = 1; i < n; i++) {
        if (arr[i] <= prev) {
            prev = prev + 1;
            sum = sum + prev;
        }
         
        else {
            sum = sum + arr[i];
            prev = arr[i];
        }
    }
 
    return sum;
}

public static void main (String[] args) {
 
    int arr[] = { 2, 2, 3, 5, 6 };
    int n = arr.length;
     
    System.out.println(minSum(arr, n));
}
}

*/