package dataStructure;

public class RemoveTail {
 

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
		System.out.println("remove last node");
		for(Node temp=head;temp!=null;temp=temp.next)
			System.out.print(temp.data+" ");
		
	}
	public static Node removenode(Node head) {
		// TODO Auto-generated method stub
		
		if(head==null){
		return null;}
		 
		if(head.next==null){
			return null;}
		
		Node Secondlast_node=head;
		while(Secondlast_node.next.next!=null){
		
			Secondlast_node=Secondlast_node.next;
		}
		Secondlast_node.next=null;
		return head;
	}
	public static Node push(Node head_ref, int data) {
		// TODO Auto-generated method stub
		
		 Node new_node=new Node(data);
			new_node.next=(head_ref);
			(head_ref)=new_node;
			return head_ref;
		
	}
}
