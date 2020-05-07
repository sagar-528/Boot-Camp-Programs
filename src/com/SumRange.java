package com;

import java.util.Scanner;

public class SumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting no.");
		int s=sc.nextInt();
		System.out.println("enter the starting no.");
		int l=sc.nextInt();

		for(int i=s;i<=l;i++)
		{
			sum+=i;
		}
		System.out.println("sum of range is"+sum);
		sc.close();
	}

}
