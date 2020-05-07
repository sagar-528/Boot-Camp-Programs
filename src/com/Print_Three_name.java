package com;

import java.util.regex.Pattern;

public class Print_Three_name {

	static String reverse(String s1)
	{
		 Pattern pattern=Pattern.compile("\\s");
		 String[] temp=pattern.split(s1);
		 String result=" ";
		 
		 for(int i=0;i<temp.length;i++)
		 {
			 if(i==temp.length-1)
				 result=temp[i]+result;
			 else
				 result=" "+temp[i]+result;
		 }
		 return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  

		String s1="alice bob carol";
		
		System.out.println(reverse(s1));
		
		
		
	}

}
