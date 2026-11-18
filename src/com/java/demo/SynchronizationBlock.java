package com.java.demo;

class DemoBlock{
	public void show()
	{
		//System.out.println("Inside show method..."+Thread.currentThread().getName());
		synchronized (this) {
			System.out.println("Inside show method..."+Thread.currentThread().getName());
			for(int i=0;i<=5;i++)
			{
				System.out.println(i+"..."+Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("End of show method..."+Thread.currentThread().getName());
		}
	}
}
class Thread11 extends Thread
{
	DemoBlock d;
	Thread11(DemoBlock d)
	{
		this.d=d;
	}
	public void run()
	{
		d.show();
	}
}
class Thread12 extends Thread
{
	DemoBlock d;
	Thread12(DemoBlock d)
	{
		this.d=d;
	}
	public void run()
	{
		d.show();
	}
}

public class SynchronizationBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DemoBlock d=new DemoBlock();
      Thread11 t11=new Thread11(d);
      Thread11 t12=new Thread11(d);
      t11.start();
      t12.start();
      
	}

}
