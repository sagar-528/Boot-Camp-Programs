package com;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
		System.out.println("enter the no. to check whether it is perfect no. or not");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		
			if(n%i==0){
			
			sum=sum+i;
			
			}
		
	
if(sum==n)
			
			System.out.println("perfect");
		
		else
System.out.println("not");

sc.close();
}
}