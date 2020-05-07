package com;

 class Tic {
	
		char[][] bd;
		char currpmark;
		
	public Tic()
	{
		bd=new char[3][3];
		currpmark='x';
		initialbd();
	}

	private void initialbd() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bd[i][j]='-';
			}
		}
	}
		
	public void printbd()
		{
			System.out.println("-------------");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(bd[i][j] + " | ");
				}
				System.out.println();
				System.out.println("-------------");
			}
		}
	public boolean bdfull()
	{
		boolean full=true;
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				if(bd[i][j]=='-'){
					full=false;
				}
			}
		}
		return false;
	}
	
	public boolean checkwin(){
		
		return (checkrowWin() || checkcolWin() || checkdiaWin());
	}

	private boolean checkrowWin() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			if(Checkrowcol(bd[i][0],bd[i][1],bd[i][2])==true){
				return true;
			}
		}
		return false;
	}


	private boolean checkcolWin() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			if(Checkrowcol(bd[0][i],bd[1][i],bd[2][i])==true) 
			{
				return true;
			}
		}
		return false;
	}

	private boolean checkdiaWin() {
		// TODO Auto-generated method stub

			return((Checkrowcol(bd[0][0],bd[1][1],bd[2][2])==true)||(Checkrowcol(bd[0][2],bd[1][1],bd[2][0])==true));
		
	}

	private boolean Checkrowcol(char c1, char c2, char c3) {
		// TODO Auto-generated method stub
		return((c1!='-') && (c1==c2) && (c2==c3));
	}
	
	public void Player()
	{ 
		if(currpmark=='x')
		
			currpmark='o';
		
		else
		
			currpmark='x';
		
	}
	
	public boolean Mark (int row,int col)
	{
		
		if((row>=0) && (row<3))
		{
			if((col>=0) && (col<3))
			{
				if(bd[row][col]=='-')
				{
					bd[row][col]=currpmark;
					return true;
				}
			}
		}
		return false;
	}
}
public class Tictac{
public static void main(String[] args)
{
	// TODO Auto-generated method stub
	
	Tic t=new Tic();
	
	t.Mark(1, 2);
	t.Mark(0, 0);
	t.Mark(2, 2);
	
	t.Player();
	
	t.Mark(0, 1);
	t.Mark(0, 2);
	t.Mark(1, 0);
	t.Mark(1, 2);
	
t.printbd();
	
	if(t.checkwin()){
		System.out.println("we win the game");
	}
	
	else if(t.bdfull()){
		System.out.println("appeare we have draw");
	}
}
}	