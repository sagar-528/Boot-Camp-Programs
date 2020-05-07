package com;

import java.util.Scanner;

public class NaturalSumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=sc.nextInt();
		int sum=0;
		for(int c=1;c<=a;c++)
		{
			sum+=c;
		}
System.out.println("sum of natural no. is"+sum);
sc.close();
	}

}
