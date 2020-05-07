package dataStructure;

import java.util.Scanner;

public class CirularLL {

	static Node head;
	static class Node
	{
		int data;
		Node next;
		public Object head;
		
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	
	public static Node AddElement(int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		
		
		if(head==null)
		{
			head=new_node;
		}
		
		else{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return head;
	}
	
	public static void print()
	{
		Node curr=head;
		System.out.println("add element");
		
		while(curr!=null)
		{
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirularLL cl=new CirularLL();
		Scanner sc=new Scanner(System.in);
int n=1,data=0;
while(n!=0)
{
	
	System.out.println("1.add element");
	System.out.println("2.rotate element");
	System.out.println("enter your choice: ");
	
	n=sc.nextInt();
	switch(n)
	{
	case 1:	System.out.println("enter the element");
			AddElement(data);
			data=sc.nextInt();
			
			break;
	
	default:System.out.println("wrong choice");	
			
	}
}
	
	}

}
