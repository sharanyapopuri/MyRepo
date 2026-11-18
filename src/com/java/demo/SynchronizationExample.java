package com.java.demo;


class Tea{
	boolean ready=false;
	synchronized public void makeTea()
	{
		System.out.println("Making tea");
		ready=true;
		notify();
	}
	synchronized public void  drinkTea()
	{
		
		if(!ready)
		{
			try {
				System.out.println("Waiting for tea.....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Drinking tea");
		
	}
}
class Thread1 extends Thread
{
	Tea t;
	Thread1(Tea t)
	{
		this.t=t;
	}
	public void run()
	{
		t.drinkTea();
	}
}
class Thread2 extends Thread
{
	Tea t;
	Thread2(Tea t)
	{
		this.t=t;
	}
	public void run()
	{
		t.makeTea();
		try {
		Thread.currentThread().sleep(2000);	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class SynchronizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea t=new Tea();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t2.start();
	}
}
