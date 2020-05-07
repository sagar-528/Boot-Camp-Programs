package com;

import java.util.Scanner;

public class powerNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,n,r=1;
		System.out.println("enter the no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the no. for power");
		p=sc.nextInt();
		
		while(p!=0)
		{
			r=r*n;
			p--;
		}
		System.out.println("the power is="+r);
		sc.close();
	}

}
