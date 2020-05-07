package dataStructure;
public class AddingFromTail{
	
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
		AddingFromTail at=new AddingFromTail();
		at.insert(30);
		at.print();
		at.insert(20);
		at.print();
		at.insert(10);
		at.print();
	}
	
public void insert (int data)
{
	Node new_node=new Node(data);
	
	if(this.head == null)
	{
		head=new_node;
		this.tail=new_node;
	}
	
	else
	{
		tail.next=new_node;
		tail=new_node;
	}
}

public void print()
	{
		Node Current=head;
		
		if(head==null)
		{
			return;
		}
	
		System.out.println("adding from Tail");
	
		while(Current!=null)
		{
			System.out.print(Current.data+" ");
			Current=Current.next;
		}
		System.out.println();
	}
}



