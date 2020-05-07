package com;

public class PyramidStar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			
				System.out.print("");
			
				while(k!=(2*i-1))
				{
					
					System.out.print("*");
					k++;
				}
				k=0;
			
			System.out.println();
		}
	}

}
