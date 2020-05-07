package com;

import java.util.Scanner;

public class ArrayDemoDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,count=0,a=0,b=0,count1=0,c = 0;
		int arr[]={33,22,56,33};
		System.out.println("after removing duplicates");
		
		for(i=0;i<=arr.length;i++)
		{
			
			for(j=1;j<=arr.length;j++)
			{
					
						if(arr[i]==arr[j])
						{
							count++;
							a=arr[i];
							System.out.println("duplicates are"+a);
						}
						
		}	
			
			if(count1>count)
			{
				c=a;
			}
			count1=count;
		b=a;
	}
		System.out.println(count1);
}

}