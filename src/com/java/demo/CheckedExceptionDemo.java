package com.java.demo;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			int a[]= {1,3,4};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			int j=10/0;
			System.out.println(j);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 exception");
		}
		System.out.println(",,,,,,,,,,,,,,exit...........");

	}

}
