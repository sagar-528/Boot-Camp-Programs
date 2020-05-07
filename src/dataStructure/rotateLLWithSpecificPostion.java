package dataStructure;



class RotateLL{
	Node head=null;
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
	
	public void push(int data){
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
		
	}
	
	public void Rotate(Node new_node)
	{
		Node Current=head;
		if(Current!=null)
		{
			
		}
		
	}
	
}

public class rotateLLWithSpecificPostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
