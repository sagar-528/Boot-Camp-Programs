package dataStructure;


 class Sorted {
	 public Node head=null;
	 public Node tail=null;
	
	 class Node{
	int data;
	Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	 }
	 
	 public void add(int data){
		 
		 Node new_node=new Node(data);
		 new_node.next=head;
		 head=new_node;
	 }
	 
	 public void Sorting(Node headref){
		 Node Current =headref;
		 
		 while(Current!=null){
			 Node next = Current.next;
			 
			 sortedinsert(Current);
			 Current=next;
		 }
		 head=tail;
	 }

	public void sortedinsert(Node new_node) {
		// TODO Auto-generated method stub
		
		if(tail==null || tail.data >= new_node.data ){
			new_node.next=tail;
			tail=new_node;
		}
		
		else
		{
			Node Current=tail;
			
			while(Current.next!=null)
			{
				Current=Current.next;
			}
			new_node.next=Current.next;
			Current.next=new_node;
		}
	}
	
	public void print(Node head){
		
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}

public class SortLinkedList {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Sorted s=new Sorted();
		
		s.add(13);
		s.add(89);
		s.add(55);
		System.out.println("linklist before sorting");
		s.print(s.head);
		s.Sorting(s.head);
		System.out.println();
		System.out.println("after sorting");
		s.print(s.head);
	}

}
