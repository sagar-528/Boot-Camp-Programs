package com;

import java.util.Scanner;

public class Greater3no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no.");
		int a=sc.nextInt();
		System.out.println("enter the second no.");
		int b=sc.nextInt();
		System.out.println("enter the thhird no.");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("the greater no. is"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("the greater no. is"+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("the greater no. is"+c);
		}
		else
		{
			System.out.println("the invalied no.");
		}
		sc.close();
	}

}
