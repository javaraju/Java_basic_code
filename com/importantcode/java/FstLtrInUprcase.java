package com.importantcode.java;
import java.util.Scanner;
public class FstLtrInUprcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a String:- ");
				String str=sc.nextLine();
				sc.close();
				String array[]=str.split(" ");
				for(int i=0;i<array.length;i++)
				{
				System.out.print(array[i].toUpperCase().charAt(0) + array[i].substring(1)+" ");
				}

			}

		}
