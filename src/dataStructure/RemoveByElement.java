package dataStructure;

class Element{

	public Node head;
	
	public class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}

	
	public void ERemove(int key)
	{
		Node temp=head,prev=null;
		
		if(temp!=null && temp.data==key){
			head=temp.next;
			return;
		}
		
		while(temp!=null & temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null) 
			return;
		
		prev.next=temp.next;
	}
	
	public void push(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	
	public void print(){
		Node tnode=head;
		while(tnode!=null){
		System.out.println(tnode.data+" ");
		tnode=tnode.next;
		}
	}
}
public class RemoveByElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Element e=new Element();
		e.push(7);
		e.push(1);
		e.push(3);
		e.push(2);
		System.out.println("delete by element");
		e.ERemove(1);
		e.print();
	
	}

}
