package com;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int y=sc.nextInt();
		
		if(y%4==0)
		{
			System.out.println("it is a leap year");
		}
		else if(y%400==0)
		{
			System.out.println("its a leap year");
		}
		else
		{
			System.out.println("its not leap year");
		}
	sc.close();
	}

}
