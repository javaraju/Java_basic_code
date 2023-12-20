package com.K12SoftwareSolution.java;

import java.util.Arrays;

public class ArraySortingNegativeWise {

	static void rearrange(int arr[], int n) 
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
            {
                if (arr[i] < 0)
                   {
                     temp = arr[i];
                        arr[i] = arr[j];
                     arr[j] = temp;
                     j++;
                   }
            }
    }
    public static void main(String args[]) 
    {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
     
        rearrange(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}