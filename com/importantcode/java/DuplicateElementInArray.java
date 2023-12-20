package com.importantcode.java;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int a[]= {2,5,6,9,8,2,5,6,2,1};
		String str="";
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(str.contains(a[i]+""))
					{
						continue;
					}
					else
					{
						str+=""+a[i];
					}
				}
			}
			
		}
		System.out.println(str);
	}

}
