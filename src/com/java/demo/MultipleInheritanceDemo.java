package com.java.demo;

interface interface1
{
	void demo();
	default void show()
	{
		System.out.println("this is show method");
	}
	
}
interface interface2
{
	void demo();
}
class child implements interface1,interface2
{
	public void demo()
	{
		System.out.println("Implementation for demo");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
	
		child c=new child();
		c.demo();
		c.show();
	}

}
