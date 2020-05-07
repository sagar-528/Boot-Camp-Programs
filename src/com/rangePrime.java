   package com;

import java.util.Scanner;

public class rangePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int	flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n1=sc.nextInt();
		System.out.println("enter the no.");
		int n2=sc.nextInt();
		
		for(int i=n1;i<n2;i++)
		{
				for(int j=2;j<i;j++)
					{
						if(i%j==0)
						{
							flag=0;
							break;
						}
						
						else
						{
							 flag=1;
						}
					}
				if(flag==1)
				{
					System.out.println("prime no. is"+i);
				}
	}
		
sc.close();
	}

}
