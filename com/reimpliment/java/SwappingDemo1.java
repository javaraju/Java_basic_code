package com.reimpliment.java;

import java.util.Scanner;
public class SwappingDemo1 {
  public static void main(String[] args) {
  // Write your code here
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Two Number:-");
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("Value of a is:- "+a);
  System.out.println("Value of b is:- "+b);
  a=a^b;
  b=a^b;
  a=a^b;
  System.out.println("Value of a is:- "+a);
  System.out.println("Value of b is:- "+b);
 }
}