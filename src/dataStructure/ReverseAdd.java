package dataStructure;

import java.util.Scanner;

public class ReverseAdd {
		
		Node head;
		class Node
		{
			int data;
			Node next;
			Node prev;
			Node(int d)
			{
				this.data=d;
				this.next=null;
				this.prev=null;
			}
		}
	
		public void push(int data)
		{
			Node node=new Node(data);
			
			if(head==null)
			{
				head=node;
				node.prev=null;
			}
			
			else
			{
				Node temp=head;
				while(temp.next!=null)
					temp=temp.next;
				
				temp.next=node;
				node.prev=temp;
			}
		}
		
		public int Getpos(int pos)
		{
			int a=0;
			
			Node temp=head;
			while(temp!=null)
			{
				a++;
				if(a==pos)
					return(temp.data);
				
				temp=temp.next;
			}
			return 0;
		}
		
		
	public void print(Node node)
	{
		node=head;
		Node end;
		
		while(node!=null)
		{
			System.out.println(node.data+" ");
			end=node;
			node=node.next;
		}
	}
	
	public void revrse(Node node)
	{
		if(head==null)
		{
			return;
		}
		revrse(head.next);
		System.out.println(head.data+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node node=null;
		int n1,n2,sum=0;
		int cry=0,rev=0,x=4,pos=1;
		
		ReverseAdd ra=new ReverseAdd();
		ReverseAdd ra1=new ReverseAdd();
		ReverseAdd ra2=new ReverseAdd();
		
		System.out.println("enter the number:");
		n1=sc.nextInt();
		
		while(n1!=0)
		{
			int k=n1%10;
			ra.push(k);
			n1/=10;
		}
		
		System.out.println("enter the number");
		
		n2=sc.nextInt();
		
		while(n2!=0)
		{
			int k=n2%10;
			ra1.push(k);
			n2/=10;
		}
		
		System.out.println("first number");
		ra.print(node);
		System.out.println();
		System.out.println("second number");
		ra1.print(node);
		System.out.println();
		
		while(x!=0)
		{
			
		sum=ra.Getpos(pos)+ra1.Getpos(pos)+cry;
			
		cry=0;
		if(sum>=10)
		{
			int s=sum;
			while(s!=0)
			{
				int k=s%10;
				rev=(rev*10)+k;
				s=s/10;
			}
			cry=rev%10;
		}
		ra2.push(sum%10);
		pos++;
		x--;
	}
		System.out.println("addtition of anwser is");
		ra2.print(node);
		
		System.out.println();
		
		System.out.println("reverse of result");
		ra2.revrse(ra2.head);
	}
}
