package com.java.demo;

class WithDraw extends Thread
{
	public void run()
	{
		try {
		System.out.println("with draw...........");
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("withdraw ends");
	}
}
class Deposit extends Thread
{
	public void run()
	{
		try {
			System.out.println("Deposit");
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("deposit ends....");
	}
}

public class MultiThreadConcurrentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WithDraw w=new WithDraw();
      w.start();
      Deposit d=new Deposit();
      d.start();
	}

}
