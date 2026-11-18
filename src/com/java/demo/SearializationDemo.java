package com.java.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long searialVersionUID = 10L;
	public int rno;
	public String name;
	public char abcd;
	//public String test="test";
	//public String demo;

	public transient String description;
	// public static String address = "Delhi";

	Student(int rno, String name, String description) {
		this.rno = rno;
		this.name = name;
		this.description = description;
	}
}

public class SearializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Student s = new Student(101, "sharanya", "indian");

		FileOutputStream fout = new FileOutputStream("one.txt");
		ObjectOutputStream o = new ObjectOutputStream(fout);
		o.writeObject(s);
		o.close();
		fout.close();
		 
		// Desearialization
		FileInputStream fin = new FileInputStream("one.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student st = (Student) oin.readObject();
		System.out.println(st.rno);
		System.out.println(st.name);
		System.out.println(st.description);
		// System.out.println(st.address);
	}

}
