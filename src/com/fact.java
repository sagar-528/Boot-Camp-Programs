package com;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fa=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fa*=i;
		}
		System.out.println("factorials are  "+fa);
		sc.close();
	}

}
