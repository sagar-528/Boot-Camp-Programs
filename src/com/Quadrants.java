package com;

import java.util.Scanner;

public class Quadrants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of x and y");
int x=sc.nextInt();
int y=sc.nextInt();

if(x>0 && y>0)
{
	System.out.println("it lies in 1st quad");
}

else if (x<0 && y>0)
{
	System.out.println("it lies in 2nd quad");
}

else if (x<0 && y<0)
{
	System.out.println("it lies in 3rd quad");
}

else if (x>0 && y<0)
{
	System.out.println("it lies in 4rt quad");
}

else if (x>0 && y==0)
{
	System.out.println("x is postive");
}

else if (x==0 && y>0)
{
	System.out.println("y is postive");
}

else if (x<0 && y==0)
{
	System.out.println("both are negative");
}

else if (x==0 && y<0)
{
	System.out.println("y is negative");
}

else 
{
	System.out.println("lies on origin");
}

sc.close();
	}

}
