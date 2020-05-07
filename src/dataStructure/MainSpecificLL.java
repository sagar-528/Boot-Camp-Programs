package dataStructure;

 class LL {

	
		Node head;
		
		static class Node
		{
			int data;
			Node next;
			
			Node(int d)
			{
				 this.data=d;
				 this.next=null;
			}
		}
	
		public void insert(int data)
		{
			Node new_node=new Node(data);
			new_node.next=null;
			
			if(this.head==null)
			{
				head=new_node;
				return;
			}
			
			Node tempNode=this.head;
			while(tempNode.next!=null)
			{
				tempNode=tempNode.next;
			}
			
			tempNode.next=new_node;
		}
		
		public void ninsert(int data,int position)
		{
			Node new_node=new Node(data);
			new_node.next=null;
			
			if(this.head==null)
			{
				if(position!=0)
				{
					return;
				}
			else
				this.head=new_node;
			}
			
			if(head==null && position==0)
			{
				new_node.next=this.head;
				this.head=new_node;
				return;
			}
			
			Node current=this.head;
			Node previous=null;
			
			int i=0;
			
			while(i<position)
			{
				previous=current;
				current=current.next;
				
				if(current==null){break;}
				i++;
			}
			
		new_node.next=current;
		previous.next=new_node;	
	}
		
		public void print()
		{
			if(this.head==null)
			{
				return;
			}
			
			Node tempNode=this.head;
			while(tempNode!=null)
			{
				System.out.print(tempNode.data+"  ");
				tempNode=tempNode.next;
			}
		}
}
		public class MainSpecificLL{
public static void main(String[] args) {
			// TODO Auto-generated method stub

		LL ls=new LL();
		ls.insert(10);
		ls.insert(20);
		ls.insert(30);
		ls.ninsert(25, 2);
		ls.print();
	}

		}
