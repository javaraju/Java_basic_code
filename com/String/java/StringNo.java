package com.String.java;

public class StringNo {

	public static void main(String[] args) {
		
		String s="raju";
		for(int j = 'A'; j <= 'Z'; j++)
		{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(s.charAt(i)+" :"+(i-'A' +1));
		}
		}

	}

}
/*for(int i = 'A'; i <= 'Z'; i++) {
    System.out.println((char) i + " : " + (i - 'A' + 1));
}*/
