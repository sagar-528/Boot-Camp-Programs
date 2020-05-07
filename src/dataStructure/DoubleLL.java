package dataStructure;

public class DoubleLL {
Node head;

class Node{
	Node next;
	int data;
	Node prev;
	Node(int d)
	{
		this.data=d;
		this.next=null;
	}
}	

public	void push(int data) 
	{
		Node new_node=new Node(data);
		new_node.next=head;
		new_node.prev=null;
		if(head!=null)
			head.prev=new_node;
			
		head=new_node;
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
		DoubleLL dl=new DoubleLL();
		dl.push(10);
		dl.print();
		dl.push(20);
		dl.print();
		dl.push(38);
		dl.print();
		
	}

}
