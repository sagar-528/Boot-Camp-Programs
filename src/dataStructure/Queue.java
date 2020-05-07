package dataStructure;


class queen
{
	class Node{
		int key;
		Node next;
		
		Node(int d)
		{
			this.key=d;
			this.next=null;
			}
	}

	Node front,rear;
	queen()
	{
		front=rear=null;
	}
	
	public void enqueue(int key)
	{
		Node new_node=new Node(key);
		if(rear == null)
		{
			front=rear=new_node;
			return;
		}
		
		rear.next=new_node;
		rear=new_node;
	}	
		
		
	public void dequeue()
	{
		if(front==null)
		{
			return;
		}
		
		Node new_node=front;
		front=front.next;
		
		if(front==null){
			rear=null;
		}
	}
}
	
public class Queue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 queen q=new  queen();
		 q.enqueue(10);
		 q.enqueue(20);
		
		 
		 q.dequeue();
		 q.dequeue();
		
		 q.enqueue(40);
		 q.enqueue(45);
		 q.enqueue(55);
		 q.dequeue();
		 
		 System.out.println("queue in front end "+q.front.key);
		 System.out.println("queue at rear end  "+q.rear.key);
	}

}
