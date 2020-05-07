package com;

import java.util.Scanner;

public class AbundantNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("enter the no. to check whether it is abundant no. or not");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum+=i;
				}
			}
		
			if(sum>n){
				System.out.println("its a abundant no.");
			}
			else
				System.out.println("not abundant no.");
		sc.close();
	}

}
