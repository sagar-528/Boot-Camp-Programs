package com;

import java.util.Scanner;

public class Maxno_ofHandshake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		r=n*(n-1)/2;
		System.out.println("max. no. of handshake is"+r);
		sc.close();
	}

}
