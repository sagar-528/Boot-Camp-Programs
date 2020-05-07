package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list=new LinkedList<String>();
		 
list.add("sagar");
list.addFirst("pawan");
list.addLast("shrimaj");
list.add(2, "lucifer");

Iterator<String> iterator=list.iterator();

	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}

	}

}
