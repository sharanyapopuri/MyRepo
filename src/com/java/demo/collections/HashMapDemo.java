package com.java.demo.collections;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "mango");
		map.put(2, "Banana");
		map.put(3, "avacado");
		/*
		 * for(Map.Entry<Integer, String> m:map.entrySet()) {
		 * System.out.println(m.getKey()+"........."+m.getValue()); }
		 */
		map.put(1, "apple");
		
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			//System.out.println(m.getKey()+"........."+m.getValue());
			System.out.println(map.get(m.getKey()));
		}
		map.remove(1);
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"........."+m.getValue());
		}
		//System.out.println(map.get(1));
	}

}
