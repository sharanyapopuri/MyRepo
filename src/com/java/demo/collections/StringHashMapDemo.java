package com.java.demo.collections;
import java.util.*;
public class StringHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am a good girl";
		HashMap<Character,Integer> map=new HashMap<>();
		//System.out.println(str.toCharArray());
		for(char ch:str.trim().toCharArray())
		{
			//System.out.println(ch);
				map.put(ch,map.getOrDefault(ch,0)+1);
			
		}
		//System.out.println(map);
		
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + "....." + m.getValue());
		}
		
		//Check two Strings Anagrams or not
		String str1="care";
		String str2="race";
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		 
	}
}
