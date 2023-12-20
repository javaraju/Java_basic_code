package com.Practice.java;

import java.util.LinkedList;
import java.util.List;

public class ExampleDemo {

	public static void main(String[] args) {
		int n=500;
		List<Integer> ll=new LinkedList<>();
		for(int i=1;i<=n;i+=2)
		{
			ll.add(i);
		}
		int j=0;
		int temp=0;
		while(true)
		{
			Integer m=ll.get(++j);
			m--;
			temp=n;
			for(int i=m;i<n;i+=m)
			{
				ll.remove(i);
				n=ll.size();
			}
			if(temp==n);
			break;
		}
		System.out.println(ll);

}
}