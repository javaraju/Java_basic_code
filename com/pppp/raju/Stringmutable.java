package com.pppp.raju;

public class Stringmutable {

	public static void main(String[] args) {
		String s="raju";
		String s1=s;
		String s2=s1;
		
		String s3=s2;
		String s4=s3;
		String s5=s4;
		String s6=s5;
		String s7=s6;
		s2=s2.concat("soni");
		//s=s.concat("soni");
		System.out.println(s7);//why String is mutable.
		
		



	}

}
