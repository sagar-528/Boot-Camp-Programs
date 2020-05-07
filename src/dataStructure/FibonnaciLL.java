package dataStructure;

import java.util.Scanner;

public class FibonnaciLL {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node()
		{
			
			this.next=null;
		}
	}
	
	public void insertAtfront(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	public void insertAtend(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=head;
		
		if(head==null)
		{
			head=node;
			
		}
		
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	
	public int getElement(int pos)
	{
		int count=0;
		Node n=head;
		while(n!=null)
		{
			count++;
			if(count==pos)
			{
				return(n.data);
			}
			n=n.next;
		}
		return 0;
	}
	
	
	public void printlist()
	{
		Node Current=head;
		
		if(head==null)
		{
			return;
		}
	
		System.out.println("fibonnaci");
	
		while(Current!=null)
		{
			System.out.print(Current.data+" ");
			Current=Current.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos=1;
		int n=0;
		System.out.println("enter the limit of fibo series");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		FibonnaciLL list=new FibonnaciLL();
		
		list.insertAtend(0);
		list.insertAtend(1);
		
		while(n!=0)
		{
			int sum=list.getElement(pos) + list.getElement(pos+1);
			list.insertAtend(sum);
			sum=0;
			pos++;
			n--;
		}
		System.out.println();
		list.printlist();
		
	}

}
