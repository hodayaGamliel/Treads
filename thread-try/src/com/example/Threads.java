package com.example;

import com.example.CaughtPointComplex;

public class Threads extends Thread
{
	public Threads()
	{
		
	}
	
	public void run()
	{
		for(int i = 1; i <= 1; i++)
		{
			try 
			{
				CaughtPointComplex c = new CaughtPointComplex();
				c.callCaughtPoint2();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("the End!");
	}
}
