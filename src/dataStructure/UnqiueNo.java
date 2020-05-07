package dataStructure;

import java.util.HashMap;

public class UnqiueNo {
	 Node head;
	
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
	
	public static Node push(Node head_ref,int data)
	 {
		 Node new_node=new Node(data);
		new_node.next=(head_ref);
		(head_ref)=new_node;
		return head_ref;
		 
	 }
	
	public static void UniqueE(Node head)
	{
		HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
		
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			if(hash.containsKey(temp.data))
			{
				hash.put(temp.data, hash.get(temp.data)+1);
			}
			else
			{
				hash.put(temp.data,1);
			}
		}
		int count=0;
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			if(hash.get(temp.data)==1)
			{ 
				System.out.println(temp.data+" ");
				count++;
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		UnqiueNo un=new UnqiueNo();
			Node head=null;

			head=push(head,2);
			head=push(head,3);
			head=push(head,2);
			head=push(head,4);
			head=push(head,5);
			head=push(head,3);
			head=push(head,1);
			
			UniqueE(head);
			
	}

}
