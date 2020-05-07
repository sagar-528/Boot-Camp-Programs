package com;

import java.util.Scanner;

public class HarshadNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0,temp;
		System.out.println("enter the no. to check whether it is harshad no. or not");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			int id=n%10;
			sum=sum+id;
			n/=10;
		}
		
		if(temp%sum==0)
		{
			System.out.println("harshad no.");
		}
		else
			System.out.println("not harshad");
		sc.close();
	}

}
