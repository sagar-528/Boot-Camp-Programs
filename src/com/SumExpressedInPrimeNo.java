package com;

import java.util.Scanner;

public class SumExpressedInPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int	x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		
		for(int i=2;i<=n/2;i++)
		{
			if(prime(i)==1)
			{
				if(prime(n-1)==1)
				{
					System.out.println(n+"="+i+"+"+(n-i));
					x=1;
				}
			}
		}
		if(x==0)
		{
			System.out.println("no. can not be expressed"+n);
		}
	}


	public static int prime(int a) {
		// TODO Auto-generated method stub
		
		int c=1;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				c=0;
				break;
			}
		}
		return c;
	}
}
