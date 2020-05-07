package com;

import java.util.Scanner;

public class MissingPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,small=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("enter the element:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
		if(arr[i]<small)
		{
		}
		if(arr[i]==small)
		{
			small+=2;
		}
	}
		System.out.println(small);
		
}

}
