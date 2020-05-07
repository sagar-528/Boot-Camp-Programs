package dataStructure;

class Search{
	public Node head=null;
	public Node tail=null;
	public class Node{
		Node next;
		int data;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	
	public void add(int data){
		Node new_node=new Node(data);
		
		if(head==null){
			head=new_node;
			tail=new_node;
		}
		else{
			tail.next=new_node;
			tail=new_node;
		}
	}
	
	public void SearchNode(int data){
		Node Current=head;
		
		int i=1;
		boolean flag = false;
		
		if(head==null){
			System.out.println("list empty");
		}
		else{
			while(Current!=null){
				if(Current.data==data){
					flag=true;
					break;
				}
				i++;
				Current=Current.next;
			}
		}
		
		if(flag==true){
			System.out.println("element is present at position :" +i);
		}
		else{
			System.out.println("element is not present");
		}
	}
}

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Search s=new Search();
		s.add(20);
		s.add(34);
		s.add(67);
		s.add(78);
		s.add(55);
		s.SearchNode(67);
		s.SearchNode(22);
	}

}
