package dataStructure;
	
class Node{
	
	int data;
	Node next;
	}; 
	class Stack{
		private Node top;
		public Stack()
		{
				this.top=null;
		}
	public void push(int x)
	{
		
		Node node=new Node();
		if(node==null){
			System.out.println("heap overflow");
			return;
		}
		System.out.println("insert"+x);
		node.data=x;
		node.next=top;
		top=node;
		
	}
	
	
	public boolean empty()
	{
		return top == null;
		
	}
	
	public int peek()
	{
		if(!empty())
		{
			return top.data;
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}	
	}
																																																																																																																						

	public void pop()
	{
		if(top==null)
		{
			System.out.println("stack under flow");
			return;
		}
		
		System.out.println("removing"+peek());
		top=(top).next;
	}
	
}
public class StackOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println("top element are:");
		
		s.pop();
		s.pop();
		s.pop();
		if(s.empty()){
			System.out.println("stack empty");
		}
		else
			System.out.println("stack not empty");
	}

}
