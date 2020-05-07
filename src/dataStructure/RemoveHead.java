package dataStructure;

public class RemoveHead {
	
	static class Node{
	Node head=null;
	Node tail=null;
	int data;
	Node next;
	
		public Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=null;
		
		head=push(head, 12);
		head=push(head, 32);
		head=push(head, 19);
		head=push(head, 10);
		head=push(head, 11);
		
		head=removenode(head);
		System.out.println("remove start node");
		for(Node temp=head;temp!=null;temp=temp.next)
			System.out.print(temp.data+" ");
		
	}
	
	public static Node removenode(Node head)
	{
		if(head==null)
		{
			return null;
		}
		
		Node temp=head;
		head=head.next;
		return head;
	}

	public static Node push(Node head_ref,int data)
	 {
		 Node new_node=new Node(data);
		new_node.next=(head_ref);
		(head_ref)=new_node;
		return head_ref;
		 
	 }
}
