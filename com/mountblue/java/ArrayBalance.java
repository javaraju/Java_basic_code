package com.mountblue.java;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayBalance {
	

	public static void main(String[] args) {
		
		int a[] = {5,6,7,6,11};
		int sum=getMinimumUniqueSum(a);
		System.out.println(sum);
	}
		
		
		static int getMinimumUniqueSum(int[] arr) {

			 int sum = 0;

			 ArrayList < Integer > arrayList = new ArrayList < Integer > (arr.length);

			 arrayList.add(arr[0]);


			 for (int i = 1; i < arr.length; i++) {

			  int val = arr[i];

			  while (arrayList.contains(val)) {

			   val++;
			  }

			  arrayList.add(val);

			 }

              for (int i = 0; i < arrayList.size(); i++) {
			  sum += arrayList.get(i);
			 }

			 return sum;
			}
	}


