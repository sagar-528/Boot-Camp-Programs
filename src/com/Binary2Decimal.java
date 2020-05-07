package com;

import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		System.out.println("enter the number to convert binary no. to decimal");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			int id=n%10;
			a+=id*Math.pow(2, b);
			n/=10;
			b++;
		}
		System.out.println(a);
		sc.close();
	}

}
