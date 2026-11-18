package com.java.demo.collections;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//maintains insertion order..
		//size dynamic in nature 
		//super class is abstract list ->List ->collections ->Iterable
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("ravi");
		
		list.add("somu");
		list.add("ramu");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		List<String> list1=new ArrayList<>();
		list1.add("abc");
		list1.add("anu");
		list1.add("kinnu");
		list1.add("bhanu");
		Collections.sort(list1);
		for(String str:list1)
		{
			System.out.println(str);
		}
		list1.remove("anu");
		list1.remove(2);
		
		for(String str:list1)
		{
			System.out.println(str);
		}
		
	}

}
