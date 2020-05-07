package dataStructure;

public class palindromeDemo {

	static class Node
	{
		Node next;
		Node prev;
		char data;
		
	}
	
	public static Node push(Node head_ref,char data)
	{
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=(head_ref);
		new_node.prev=null;
		
		if(head_ref==null)
			(head_ref).prev=new_node;
			(head_ref)=new_node;
		return head_ref;
	}
	
	public static boolean palin(Node left)
	{
		if(left==null)
		{
			return true;
		}
		
		Node right=left;
		while(right.next!=null)
			right.next=right;
			while(left!=right)
			{
			if(right.data!=left.data)
			return false;
			
			left=left.next;
			right=right.prev;
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		Node head=null;
		head=push(head,'r');
		head=push(head,'n');
		head=push(head,'r');
		
		if(palin(head))
		
			System.out.println("is palindrome");
		
		else
			
			System.out.println("not palindrome");
	}

}
 