package com.java.demo;

class ThreadDemo12 extends Thread
{
	ThreadDemo12(String name,int priority)
	{
		super(name);
		setPriority(priority);
	}
	public void run()
	{
		System.out.println("Thread running "+getName()+".........."+getPriority());
	}
}

public class ThreadSchedularDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo12 t=new ThreadDemo12("Thread1",6);
		ThreadDemo12 t1=new ThreadDemo12("Thread2",2);
		ThreadDemo12 t2=new ThreadDemo12("Thread3",6);
		ThreadDemo12 t3=new ThreadDemo12("Thread4",1);
		ThreadDemo12 t4=new ThreadDemo12("Thread5",9);
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
