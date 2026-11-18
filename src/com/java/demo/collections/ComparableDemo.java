package com.java.demo.collections;
import java.util.*;

class Student1 implements Comparable<Student1>{
	int rno;
	String name;
	Student1(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public String toString()
	{
		return rno+"...."+name;
	}
	
	@Override
	public int compareTo(Student1 o) {
		return (o.rno<this.rno)?1:-1;
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> list=new ArrayList<>();
		list.add(new Student1(12,"seetu"));
		list.add(new Student1(1,"sweta"));
		list.add(new Student1(15,"mamata"));
		list.add(new Student1(2,"pallavi"));
		Collections.sort(list);
		for(Student1 st:list)
		{
			System.out.println(st);
		}
	}
}
