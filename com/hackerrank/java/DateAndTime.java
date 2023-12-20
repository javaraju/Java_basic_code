package com.hackerrank.java;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateAndTime {
	    public static String getDay(String day, String month, String year) {
	       
	        int dy = Integer.parseInt(day);
	        int mnt = Integer.parseInt(month);
	        int yr = Integer.parseInt(year);
	        Calendar c = Calendar.getInstance();
	        c.set(Calendar.YEAR,yr);
	        c.set(Calendar.MONTH,mnt-1);
	        c.set(Calendar.DAY_OF_MONTH,dy);
	        
	        Date date = c.getTime();
	        DateFormat dff = new SimpleDateFormat("EEEEEEEE");
	        String dt = dff.format(date);
	       
	        return dt.toUpperCase();
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date,Month,Year:");
		String date=sc.nextLine();
		String month=sc.nextLine();
		String year=sc.nextLine();
		System.out.println((getDay(date,month,year)));

	}

}
