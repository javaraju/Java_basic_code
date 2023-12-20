package com.arraysprogram.java;
class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no , String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	
}
public class ArraysObjectDemo {
	public static void main(String[] args)
	{
		Student arr[]=new Student[5];
		arr[0]=new Student(1,"raju");
		arr[1]=new Student(2,"Ranjita");
		arr[2]=new Student(3,"Rani");
		arr[3]=new Student(4,"Amit");
		arr[4]=new Student(5,"Uday");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Student id and name is: "+i+"  = "+arr[i].roll_no+"  "+arr[i].name);
		}
		
	}

}
