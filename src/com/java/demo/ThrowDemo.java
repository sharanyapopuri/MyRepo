package com.java.demo;

import java.io.FileNotFoundException;

public class ThrowDemo {
	void method(String str) throws FileNotFoundException
	{
		System.out.println("inside method");
		throw new FileNotFoundException("file is not available");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For unchecked exception we dont use throws
		/*
		 * int age=16; if(age<=18) throw new
		 * ArithmeticException("Not eligible to vote");
		 */
		
		//For checked exceptions we use throws
		try
		{
			new ThrowDemo().method("calling file not found exception");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Inside catch block...."+e.getMessage());
		}

	}

}
