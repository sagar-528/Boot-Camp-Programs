package dataStructure;


public class Doubletail {

	Node head;
	Node last;
	class Node
	{
		Node next;
		int data;
		Node prev;
		
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}	
	public void pTail(int data)
		{
			Node new_node=new Node(data);
			Node last=head;
			new_node.next=null;
			
			if(head==null)
			{
				new_node.prev=null;
				head=new_node;
				return;
			}
			
			while(last!=null)
			
				last=last.next;
			
			last.next=new_node;
			new_node.prev=last;
		}
	
	
	public void print()
	{
		Node Curr=head;
		if(head==null){
			return;
		}
		System.out.println("adding");
		while(Curr!=null)
		{
			System.out.print(Curr.data+" ");
			Curr=Curr.next;
		}
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubletail dt=new Doubletail();
		dt.pTail(20);
		dt.pTail(23);
		dt.pTail(10);
		dt.print();
	}

}
