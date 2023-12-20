package com.Exam.java;

public class HashCodeDemo {
	int i;
	HashCodeDemo(int i)
	{
		this.i=i;
	}
	/*public String toString()
	{
		return i+" ";
	}
*/
	public static void main(String[] args) {
		HashCodeDemo h=new HashCodeDemo(10);
		System.out.println(h);
		int Hashcode=h.hashCode();
		System.out.println("HashCode Of Given Object Is: "+Hashcode);
		String s=h.toString();
		System.out.println("Reference of an Object is: "+s);

	}

}
