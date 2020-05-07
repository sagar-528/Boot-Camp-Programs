package dataStructure;

public class SelfAdding {

	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	
	public void Insert(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	public void  InsertAt(int index,int data)
	{
		
		Node new_node=new Node(data);
		new_node.next=null;
		
		
		if(index==0)
		{
			Insert(data);
		}
		Node node=head;
		for(int i=0;i<index-1;i++)
		{
			 node=node.next;
		}
		new_node.next=node.next;
		node.next=new_node;
	}
	
	public void print()
	{
		Node curr=head;
		if(head==null){return;};
		System.out.println("adding from head");
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelfAdding sa=new SelfAdding();
		sa.Insert(25);
		sa.Insert(23);
		sa.Insert(33);

		sa.print();
	}

}
