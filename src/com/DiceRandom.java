package com;

import java.util.Random;
import java.util.Scanner;

public class DiceRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,mi=0,num;
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to roll dice");
		n=sc.nextInt();
		int arr[]={0,0,0,0,0,0};
		for(i=0;i<n;i++)
		{
			num=r.nextInt(6)+1;
			System.out.println(num+" ");
			arr[num-1]++;
			if(arr[num-1]>arr[mi])
			{
				mi=num-1;
			}
		}
				System.out.println();
				System.out.println("max count");
				for(i=0;i<6;i++)
				{
					if(arr[i]==arr[mi])
					{
						System.out.println((i+1)+" ");
					}
				}
	}
}
