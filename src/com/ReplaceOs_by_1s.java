package com;

import java.util.Scanner;

public class ReplaceOs_by_1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
	
		String str=Integer.toString(n);
		int l=str.length();
		String r="";
		
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)=='0')
			{
				r=r+'1';
			}
			else
				r=r+str.charAt(i);
		}
		System.out.println("output "+r);
	sc.close();
	}
}
