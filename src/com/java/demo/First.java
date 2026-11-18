package com.java.demo;

import java.util.Arrays;

class Demo
{
	int j;
}

public class First {

	public static void main(String[] args) {
		System.out.println("this is my first java programme");
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.j=21;
		System.out.println("value is....."+d.j);
		
		//for each demo
		String arr[]= {"java","c","c++"};
		for(String course:arr)
		{
			System.out.println(course);
		}
		
		int digit=0,reverse=0;
		int num=123;
		int copy=num;
		while(num>0)
		{
			digit=num%10;
			reverse=(reverse*10)+digit;
			num=num/10;
			
		}
		System.out.println(reverse);
		System.out.println(num);
        if(copy==reverse)
        	System.out.println("ploindrom");
        
        
        int[] array= {3,6,2,17,4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        
	}

}
