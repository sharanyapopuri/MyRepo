package com.java.demo;


//create thread using thread class & runnable interface
class ThreadDemo  extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
class ThreadDemo1  implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
public class SimpleThreadCreation  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t=new ThreadDemo();
		t.start();
		ThreadDemo1 t1=new ThreadDemo1();
		Thread t2=new Thread(t1);
		t2.start();
		

	}

}
