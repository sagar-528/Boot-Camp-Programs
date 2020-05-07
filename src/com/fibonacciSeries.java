package com;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to check whether it is fibonacci no.");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+a);
		}
		
sc.close();
	}

}
