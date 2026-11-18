package com.java.demo;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string reverse
		//String str="hello";
		StringBuffer str=new StringBuffer("madam");
		StringBuffer str1=new StringBuffer(str);
		str.reverse();
		System.out.println(".....reverse string is..."+str.toString());
		System.out.println(str);
		System.out.println(str1);
		System.out.println();
		if(str1.toString().equals(str.toString()))
		{
			System.out.println(str);
			System.out.println(str1);
			System.out.println("polindrom");
		}
		
		String one="hello";
		char arr[]=one.toCharArray();
		//char arr1[]=new char[one.length()];
		StringBuffer b=new StringBuffer(arr.length);
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			b.append(arr[i]);
			
		}
		System.out.println("reverse string is "+b.toString());
		
		
		//capitalize every first word 
		
		String three="I am an indian";
		String[] words=three.split("\\s");
		String final1 = "";
		System.out.println(Arrays.toString(words));
		for(String word:words)
		{
			String firstchar=word.substring(0,1).toUpperCase();
			String remaingWord=word.substring(1);
			//System.out.println(word);
			final1=final1+firstchar+remaingWord+" ";
		}
		System.out.println(final1.trim());
		
		
		//reverse every word in a sentance
		
		String four="my name is sharanya";
		StringBuffer five=new StringBuffer(four.length());
		String reverseWords[]=four.split("\s");
		for(String reverseWord:reverseWords)
		{
			StringBuffer six=new StringBuffer(reverseWord);
			five.append(six.reverse());
			five.append(" ");
		}
		System.out.println(five.toString());
		
		System.out.println(args[0]);
		
		
	}
}
