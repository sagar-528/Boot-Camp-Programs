package dataStructure;

 class Remove{

Node head;
	class Node{
	int data;
	Node next;
	
		public Node(int d)
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
	
	public void removeN(int postion)
	{
		if(head==null)
		{
			return;
		}
		
			Node temp=head;
		
		if(postion==0)
		{
			head=temp.next;
			return;
		}
		
		for(int i=0;temp!=null && i<postion-1;i++)
		{
			temp=temp.next;
		}
		
		if(temp==null || temp.next==null )
		{
			return;
		}
		 Node next=temp.next.next;
		 temp.next=next;
	}
	
	
	public void print(){
		Node Tnode=head;
		while(Tnode!=null){
			System.out.print(Tnode.data+" ");
			Tnode=Tnode.next;
		}
	}
 }
	public class RemoveSpecific{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove r=new Remove();
		
		r.push(23);
		r.push(45);
		r.push(34);
		
		r.removeN(0);
		r.print();
	}

}
