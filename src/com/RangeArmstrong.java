package com;

import java.util.Scanner;

public class RangeArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int l=sc.nextInt();
		System.out.println("enter the no.");
		int h=sc.nextInt();
		
		for(int i=l;i<=h;i++)
		{
			temp=i;
			sum=0;
			
			while(temp!=0)
			{
				int ld=temp%10;
				sum=sum+(ld*ld*ld);
				temp/=10;
			}
			if(sum==i)
			{
				System.out.println("the range armstrong no. are"+i);
			}
			sc.close();
		}
																															}
}


