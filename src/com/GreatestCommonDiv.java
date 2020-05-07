package com;

import java.util.Scanner;

public class GreatestCommonDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		System.out.println("enter the 2 no.");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		if(n1!=n2)
		{
			while(a!=0)
			{
				a=n1%n2;
				if(a!=0)
				{
					n1=n2;
					n2=a;
				}
			}
			System.out.println("GCD is"+n2);
		}
		else
		System.out.println("wrong no. entered");
		sc.close();
	}

}
