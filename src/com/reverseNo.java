package com;

import java.util.Scanner;

public class reverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ld=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
				while(n!=0)
		{
			ld*=10;
			ld+=n%10;
			n/=10;
		}
				System.out.println("the reverse no. are"+ld);
				sc.close();
	}

}
