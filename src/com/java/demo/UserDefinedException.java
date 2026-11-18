package com.java.demo;

public class UserDefinedException extends Exception{
	
public UserDefinedException(String s) {
	super(s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new UserDefinedException("This is user defined exception");
		}
		catch(UserDefinedException u)
		{
			System.out.println(u.getMessage());
		}

	}

}
