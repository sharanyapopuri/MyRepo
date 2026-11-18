package com.java.demo.collections;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//maintains insertion order //allows duplicates //traverse in both directions //stores actual value and previous & next node addresses
		//super class is abstract list dequeue
		
		List<String> list=new LinkedList<>();
		list.add("teena");
		list.add("arha");
		list.add("neha");
		/*
		 * for(String str:list) { System.out.println(str); }
		 */
		
		list.addFirst("megha");
		list.addLast("nikesh");
		
		/*
		 * for(String str:list) { System.out.println(str); }
		 */
		
		/*
		 * Iterator itr=list.reversed().iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		list.remove(0);
		/*
		 * for (String str : list) { System.out.println(str); }
		 */
		
		list.add(0,"nisha");
		for (String str : list) {
			System.out.println(str);
		}

	}

}
