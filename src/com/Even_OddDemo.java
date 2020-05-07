package com;

import java.util.Scanner;

public class Even_OddDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("it is even no."+a);
		}
		else{
			System.out.println("it is odd no."+a);
		}
		sc.close();
	}
	
}
