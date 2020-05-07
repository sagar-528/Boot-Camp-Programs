package com;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("program for intersection");
		System.out.println("enter the size of arr");
		int n=sc.nextInt();
		int a1[]=new int[n];
		System.out.println("enter the value of array1");
		for(int i=0;i<n;i++)
		{	
			a1[i]=sc.nextInt();	
		}
		
		System.out.println("enter the size of arr");
		int n1=sc.nextInt();
		int a2[]=new int[n1];
		System.out.println("enter the value of array1");
		
		for(int i=0;i<n;i++)
		{	
			a1[i]=sc.nextInt();	
		}

		Arrays.sort(a1);
		int s=0,t=0;
		while(s<n && t<n1)
		{
			if(a1[s]>a2[t])
			{
				t++;
			}
			else if(a1[s]<a2[t])
			{
				s++;
			}
			
			
			else
			{
				System.out.println(a1[s]);
			s++;
			t++;
			}
		}

	}
}
