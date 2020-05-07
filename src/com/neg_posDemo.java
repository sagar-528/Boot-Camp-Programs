package com;
import java.util.Scanner;
public class neg_posDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int s=sc.nextInt();
		if(s>0)
		{
			System.out.println("no. is positive ");
		}
		else if(s<0)
		{
			System.out.println("no. is negative");
		}
		else{
			System.out.println("no. is zero");
		}
		sc.close();
	}

}
