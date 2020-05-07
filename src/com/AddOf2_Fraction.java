package com;

import java.util.Scanner;

public class AddOf2_Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d,x;
		
		
		System.out.println("enter 2 numerator and denometor for addtion of fraction");
		Scanner sc=new Scanner (System.in);
		System.out.println("enter 1st numerator");
		int n1=sc.nextInt();
		
		System.out.println("enter 1st denometer");
		int d1=sc.nextInt();
		
		System.out.println("enter 2nd numerator");
		int n2=sc.nextInt();
		
		System.out.println("enter 2nd denometer");
		int d2=sc.nextInt();
		
		
		System.out.println("("+n1+"/"+d1+")+("+n2+"/"+d2+")=");
		
		if(d1==d2)
		{
			n=n1+n2;
			d=d1;
		}
		else
		{
			n=(n1*d2)+(n2*d1);
			d=d1*d2;
		}
		if(n>d)
		{
			x=n;
		}
		else
			x=d;
		for(int i=1;i<=x;i++)
		{
			if(n%i==0 && d%i==0)
			{
				n/=i;
				d/=i;
			}
		}
		
		int w=1;
		int p=n;
		int q=d;
		if(n!=d)
		{
			while(w!=0)
			{
				w=n%d;
				if(n!=0)
				{
					n=d;
					d=w;
				}
			}
		}
		System.out.println("("+p/d+"/"+q/d+")");
		sc.close();
	}

}
