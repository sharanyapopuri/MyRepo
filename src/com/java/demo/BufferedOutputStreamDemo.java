package com.java.demo;

import java.io.*;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("three.txt");
		BufferedOutputStream b=new BufferedOutputStream(fout);
		String str="buffer demo";
		b.write(str.getBytes());
		b.flush();
		b.close();
		fout.close();
		
		FileInputStream fin=new FileInputStream("three.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i=0;
		while((i=bin.read())!=-1)
		{
			System.out.println((char) i );
		}
		bin.close();
	    fin.close();
	}

}
