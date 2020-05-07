package com;

import java.util.Scanner;

public class primeNoDmeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
			
			if(flag==1)
			{
				System.out.println("its prime");
			}
			else
			{
				System.out.println("its not prime");
			}	
sc.close();
	}

}
