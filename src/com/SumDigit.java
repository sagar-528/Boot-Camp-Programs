package com;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
			int sum=0;
			while(n!=0)
			{
				sum+=n%10;
				n/=10;
			}
			System.out.println("sum of digit is "+sum);
	sc.close(); 
	}

}
