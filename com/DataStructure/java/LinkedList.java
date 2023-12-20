package com.DataStructure.java;

public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node mode=new Node();
		mode.data=data;
		mode.next=null;
		if(head==null)
		{
			head=mode;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=mode;
		}
	}
	public void show()
	{
		Node m=head;
		while(m.next!=null)
		{
			System.out.println(m.data);
			m=m.next;
		}
		System.out.println(m.data);
	}
}