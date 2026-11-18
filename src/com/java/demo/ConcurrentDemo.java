package com.java.demo;

class MultiThreadDemo extends Thread
{
	String clientName;
	public MultiThreadDemo(String s) {
		// TODO Auto-generated constructor stub
		clientName =s;
	}
	public void run()
	{
		System.out.println(clientName);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(clientName+"...ends");
	}
}
public class ConcurrentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadDemo m1=new MultiThreadDemo("withdraw");
		MultiThreadDemo m2=new MultiThreadDemo("Deposit");
		m1.start();
		m2.start();
		

	}

}
