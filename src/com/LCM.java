package com;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,i;
		System.out.println("enter the 2 no. for hcf");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		a=(n1>n2)? n1:n2;
		for(i=a;i<=n1*n2;i+=a)
		{
			if(i%n1==0 && i%n2==0)
			{
				break;
			}
		}
		System.out.println("lcm is"+i);
		sc.close();
	}

}
