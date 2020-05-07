package com;

import java.util.Scanner;

public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
int r1,r2,r3,r4=0;

Scanner sc=new Scanner (System.in);
System.out.println("enter the value of a");
a=sc.nextInt();

System.out.println("enter the value of b");
b=sc.nextInt();

System.out.println("enter the value of c");
c=sc.nextInt();

r1=a+b*c;
System.out.println("result is"+r1);
r2=(a*b)+c;
System.out.println("result is"+r2);
r3=c+(a/b);
System.out.println("result is"+r3);
r4=(a%b)+c;
System.out.println("result is"+r4);
	}

}
