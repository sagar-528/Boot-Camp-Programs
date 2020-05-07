package com;

import java.util.Scanner;

public class FriendlyPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=0;
		System.out.println("enter the 2 no. to check whether it is friendly pair or not");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		 
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
				a+=i;
		}
		for(int i=1;i<n2;i++)
		{
			if(n2%i==0)
				b+=i;
		}
		 if(n1==b && n2==a)
		 {
			 System.out.println("it is friendly pair");
		 }
		 else
			 System.out.println("it is not");
		 sc.close();
	}
}