package com.IbmQuestion.java;

import java.util.Scanner;

public class NextToLast {

	public static void main(String[] args) {
			

			String string ="";

			Scanner in = new Scanner(System.in);

			System.out.println("Enter a sentence :");

			string= in.nextLine();
			String str[]=string.split(" ");
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[str.length-1]);
				break;
			}

			/*System.out.println("Last word of the sentence is :" 
			+string.substring (string.lastIndexOf (' '), string.length()));

			}*/

	}

}
