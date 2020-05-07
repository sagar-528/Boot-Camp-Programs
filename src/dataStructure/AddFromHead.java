package dataStructure;



public class AddFromHead {
	Node head=null;
	Node tail=null;
	public class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			 this.data=d;
			 this.next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddFromHead ah=new AddFromHead();
		ah.insert(30);
		ah.print();
		ah.insert(20);
		ah.print();
		ah.insert(10);
		ah.print();
	}
	
public void insert (int data)
{
	Node new_node=new Node(data);
	
	if(head == null) 
	{
		head=new_node;
		tail=new_node;
	}
	
	else
	{
		Node temp=head;
		head=new_node;
		head.next=temp;
	}
}

public void print()
	{
		Node Current=head;
		
		if(head==null){
			return;
		}
	
		System.out.println("adding from Head");
	
		while(Current!=null)
		{
			System.out.print(Current.data+" ");
			Current=Current.next;
		}
		System.out.println();
	}
}
