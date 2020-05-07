package com;

import java.util.Scanner;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[20];
		System.out.println("enter the no. to convert decimal no. into binary");
	
		int n=sc.nextInt();
		int i=0;
		while(n>0)
		{
			int r=n%2;
			arr[i++]=r;
			r/=2;
		}
		System.out.println("binary no. is");
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		sc.close();
	}

}
