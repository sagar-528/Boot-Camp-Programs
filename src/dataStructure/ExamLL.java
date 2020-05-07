package dataStructure;

import java.util.Scanner;
public class ExamLL {
	
	static Node head=null;
	static class Node
	{
		Node next;
		int data;
		
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}

	public void insert(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
			head=new_node;
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
				temp.next=new_node;
		}
		
	}
	
	public boolean GetE(int data)
	{
		
		Node temp=head;
		
		while(temp.next!=null)
		{
			if(temp.data==data)
			return true;
			temp=temp.next;
		}
		return false;
	}
	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,pos,i,n;
		ExamLL arr[]=new ExamLL[11];
		for(i=0;i<11;i++)
			arr[i]=new ExamLL();
		
		Scanner sc=new Scanner(System.in);
	
			
			System.out.println("1.Add Element");
			System.out.println("2.Get Element");
			System.out.println("3.print");
			System.out.println("enter your choice: ");
			
			n=sc.nextInt();
				if(n!=4)
					
			switch(n)
			{
			case 1:	System.out.println("enter the element");
					a=sc.nextInt();
					pos=a%i;
					arr[pos].insert(a);
					break;
					
			case 2:System.out.println("enter the value to get");
					a=sc.nextInt();
					pos=a%i;
				if(	arr[pos].GetE(a))
					System.out.println("found in arr");
					else
						System.out.println("not found in arr");
					break;
					
			case 3:	System.out.println("all the element which are inserted:");
					for(i=0;i<11;i++)
					{
						System.out.println("pos is:"+(i+1)+":");
						arr[i].print();
					}
						break;
			
			case 4:System.out.println("wrong choice");	
					
			}
	
		sc.close();
	}

}
