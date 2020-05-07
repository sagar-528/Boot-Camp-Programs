package com;

import java.util.Scanner;

public class PalenWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int st=s.length();
		
		String st2="";
		for(int i=st-1;i>=0;i--)
		{
			st2=st2+s.charAt(i);
		}
		if(s.equals(st2))
		{
			System.out.println("is palendrome");
		}
		else
			System.out.println("not palendrome");
		sc.close();
		
	}

}
