package dataStructure;

public class Armstrong {
static int sum=0;
Node head;
	static class Node
	{
		int data;
		Node next;
	}
		
		private static Node push1(Node head2, int data) 
		{
			// TODO Auto-generated method stub
			Node new_node=new Node();
			new_node.data=data;
			new_node.next=head2;
			head2=new_node;
			return head2;
		}
		
		public static void check(Node head)
		{
			if(head==null)
			{
				return;
			}
			check(head.next);
			int temp=head.data*head.data*head.data;
			sum=sum+temp;
		}
		
		public static int checktill(Node head)
		{
			sum=0;
			check(head);
			return sum;
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong ar=new Armstrong();
		
		Node head1=null;
		
	head1=push1(head1,1);
	head1=push1(head1,5);
	head1=push1(head1,3);
	
	if(ar.head!=head1)
	
		System.out.println("its armstrong :"+checktill(head1));
	
	else
		System.out.println("not");
	}
}


