package com.Apps.Raju;

import java.util.Scanner;

public class FahrenhaitToCelcios {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit:");
		float f=sc.nextFloat();
		float c=(float)((f-32.0)/1.8);
		System.out.println("Temperature in Celcius:"+c);

	}

}
