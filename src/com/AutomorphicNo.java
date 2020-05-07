package com;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,sqt;
		System.out.println("enter the no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		sqt=n*n;
		while(n>0)
		{
			if(sqt%10!=n%10)
			{
				flag=1;
				break;
			}
			n=n/10;
			sqt/=10;
		}
	if(flag==1)
	{
		System.out.println("its is not automorphic no.");
	}
	else
		System.out.println("it is automorphic no.");
	
	sc.close();
	}

}
