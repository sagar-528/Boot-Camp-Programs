package com;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,i,sum=0,f;
		System.out.println("enter the no. to check whether it is strong no. or not");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(temp!=0)
		{
			int id=temp%10;
			f=1;
			for(i=id;i>=1;i--)
			
				f*=i;
			
			sum=sum+f;
			temp=temp/10;
		}
		if(sum==n)
		
			System.out.println("strong");
		
		else
			System.out.println("not");
		
		sc.close();
		
	}
	}
