package com.Apps.Raju;

import java.util.Scanner;

public class TempCount {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter tepm in Celcius:-");
		float n=sc.nextFloat();
		float f=(float)((1.8*n)+32.0);
		System.out.println("Temperature in Fahrenheit="+f);

	}

}
