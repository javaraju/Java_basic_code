package com.rs.java;

import java.util.IdentityHashMap;

public class IdentityHashMa {

	public static void main(String[] args) {
		IdentityHashMap<Integer,String> mp=new IdentityHashMap<>();
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		
	    mp.put(I1,"Raju");
	   
		mp.put(I2,"kumar"); 
		

		System.out.println(mp);
	}

}
