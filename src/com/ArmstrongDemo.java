package com;

import java.util.Scanner;

public class ArmstrongDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ld,c=0,n,temp;
System.out.println("enter the no. to check whether it is palinedrome ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
		while(n>0)
		{
			
			ld=n%10;
			c=c+(ld*ld*ld);
			n/=10;
		}
		if(c==temp)
		{
		System.out.println("it is armstong no. is ");
		}
		else
			{
			System.out.println("not an armstrong no.");
			}
		sc.close();
		}

}
