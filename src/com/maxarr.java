package com;

import java.util.Scanner;

public class maxarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("enter the element");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j] && i!=j)
		{
			System.out.println("max"+a[j]);
		}
	}
}
	}

}
