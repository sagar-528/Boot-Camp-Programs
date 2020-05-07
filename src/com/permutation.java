package com;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	StringPermutation("JSP");
}

	 static public void StringPermutation(String input)
		{
			StringPermutation("",input);
		}
	private static void StringPermutation(String permutation ,String input) {
		// TODO Auto-generated method stub
		if(input.length()==0)
		{
			System.out.println(permutation);
		}
		else
		{
			for(int j=0;j<input.length();j++)
			{
				StringPermutation(permutation+input.charAt(j),input.substring(0,j)+input.substring(j+1,input.length()));
			}
		}
		
	}
	
}
