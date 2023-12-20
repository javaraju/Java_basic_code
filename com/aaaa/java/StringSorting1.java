package com.aaaa.java;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class StringSorting1 {
	 public static void main(String[] args) {
		 Collator c = Collator.getInstance();
		 String o = "�DAedCaBAcbA�aAaHHii";
		 String[] s = o.split("");
		 Arrays.sort(s, c);
		 for (int i = 0; i < s.length; i++) {
			 System.out.print(s[i]);
		 }
	 }

}

