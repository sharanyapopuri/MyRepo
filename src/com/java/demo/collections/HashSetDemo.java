package com.java.demo.collections;
import java.util.*;


public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Default size is 16 and load factor is 0.75
		//insertion order not maintained
		//duplicates are not allowed  uses hash code to store elements
		//not synchronized
		//used for faster operations like search operations 
		//extends AbstractSet and Set interface
		//LinkedHashSet is similar to HashSet ....only diff is, it maintains insertion order 
		//LinkedHashSet    combination of hashtable & linked list impl
		HashSet<String> set=new HashSet<>();
		set.add("Ravi");
		set.add("shanvi");
		set.add("dheeraj");
		/*
		 * Iterator itr=set.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		set.add("Ravi");
		
		/*
		 * for (String str : set) { System.out.println(str); }
		 */
		 
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("shanvi");
		list.add("Nirupam");
		set.addAll(list);
		
		for (String str : set) {
			System.out.println(str);
		}
		
		set.removeAll(list);
		System.out.println("-------------");
		
		for (String str : set) {
			System.out.println(str);
		}
		set.remove("Ravi");
		System.out.println("*************");
		
		for (String str : set) {
			System.out.println(str);
		}
		
		set.clear();
		
		System.out.println("............");
		
		for (String str : set) {
			System.out.println(str);
		}
		set.add("test");
		set.add("demo");
		System.out.println(set);
		System.out.println(set.toString());
		System.out.println(set.toArray());
		
		
		
		
	}
}
