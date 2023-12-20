package com.mountblue.java;

public class LastAddition {
	public static int fun(int re)
	{
		int result=0;
		int reminder;
		while(re>0)
		{
			reminder=re%10;
			re=re/10;
			result=result+reminder;
		}
		return result;
	}

	public static void main(String[] args) {
		int sum=0;
		int r;
		int arr[]= {64248,855,95486,31254,424587,224587,7245,5987,91254};
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Arr element= "+sum);
		int temp=sum;
		int re=0;
		while(sum>0)
		{
			/*System.out.print(sum%10);
			sum=sum/10;*/
			r=sum%10;
			sum=sum/10;
			re=re+r;
		}
		//53 is sum of array element now add sum digit also
		System.out.println("Addition of "+temp+" digit is= "+re);
		int result=fun(re);
		System.out.println("Final Single digit result is= "+result);

	}

}
