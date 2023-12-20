package com.reimpliment.java;

public class Example {
	 static String name;
	static int rollno;
	 Example(String n,int r)
	{
		name=n;
		rollno=r;
	}
	 public  void show()
	 {
		 System.out.println("name : "+name+", rollno : "+rollno);
		 
	 }
	public static void main(String[] args) {
		Example e1=new Example("Raju",201);
		//Example e2=new Example("Ranjita",202);
		e1.show();
		//e2.show();
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(Example.rollno);
		System.out.println(Example.name);
	}

}
