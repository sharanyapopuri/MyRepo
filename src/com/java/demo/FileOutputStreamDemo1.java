package com.java.demo;
import java.io.*;

public class FileOutputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("two.txt");
		String str="Capgemini Company";
		fout.write(str.getBytes());
		fout.close();
		
		FileOutputStream fout1=new FileOutputStream("two.txt",true);
		String str1="Software Company";
		fout1.write(str1.getBytes());
		fout1.close();
		
		//read from a file
		try {
		FileInputStream fin=new FileInputStream("two.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
		System.out.println((char) i);	
		}
		fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
