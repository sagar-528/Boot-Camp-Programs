package com;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		int temp=0;
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elments");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			for(j=1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("second largest no."+temp);
	}

}
