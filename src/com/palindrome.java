package com;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp=0,x=0;
		System.out.println("enter the no. to check whether it is palinedrome ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		n=temp;
		
		while(n!=0)
		{
			x*=10;
			x+=n%10;
			n/=10;
		}
		if(x==temp)
			System.out.println("it is palindrome");
		else
			System.out.println(" it is not palindrome");
		sc.close();
	}

}
