package com;

import java.util.Scanner;

public class Greatest2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no.");
		int a=sc.nextInt();
		System.out.println("enter the second no.");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(" a is greater then b"+a);
		}
		else
		{
			System.out.println("b is greater then a"+b);
		}
		sc.close();
	}

}
