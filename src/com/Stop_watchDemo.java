package com;

import java.util.Scanner;

public class Stop_watchDemo {
	
	public int startT=0;
	public int stopT=0;
	public int etime;
	public void start()
	{
		startT=(int) System.currentTimeMillis();
		System.out.println("starting time is: "+startT);
	}
	
	public void stop()
	{
		stopT=(int) System.currentTimeMillis();
		System.out.println("starting time is: "+stopT);
	}
	
	public int GetElapsedTime()
	{
		etime=startT-stopT;
		return etime;
	}
	
	public static void main(String[] args)
	{
		Stop_watchDemo sw=new Stop_watchDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("press any no. to start...");
		int n=sc.nextInt();
		sw.start();
		
		System.out.println();
		
		System.out.println("press any no. to stop...");
		int u=sc.nextInt();
		sw.stop();
		
		int etime=sw.GetElapsedTime();
		System.out.println();
		System.out.println("total tim elpased is"+etime);
		System.out.println("convert millisec in sec"+(etime/1000)+"sec");
		System.out.println("convert millisec in min"+(etime/60000)+"min");
	}

}
    