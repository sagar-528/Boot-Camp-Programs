package com;

import java.util.Scanner;

public class Binary2Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		System.out.println("enter the number to convert binary no. to octal");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			int id=n%10;
			a+=id*Math.pow(2, b);
			n/=10;
			b++;
		}

		int o[]=new int[20];
		int i=0;
		
		while(a>0)
		{
			int r=a%8;
			o[i++]=r;
			a/=8;
		}
	
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(o[j]);
		}
		sc.close();
	}
}
