package com.java.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33,4,56,3,23};
		int min = 0;
		min=arr[0];
		//finding min value
		for(int i=0;i<arr.length;i++)
		{
			
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("min value is.."+min);
		
		
		//copy elements from one array to other
		int source[]= {1,3,7,9};
		int copyarr[];
		System.out.println("source array");
		for(int s:source)
			System.out.println(s);
		System.out.println("Copied array");
		copyarr=source.clone();
		for(int c:copyarr)
			System.out.println(c);
		
		
		//find number of occurences of each number in array
		
		int numbers[]= {3,4,5,7,3,4,5};
		for(int i=0;i<numbers.length;i++)
		{
			int noToCountFrequency=numbers[i];
			int count=0;
			for(int j=0;j<numbers.length;j++)
			{
				if(noToCountFrequency==numbers[j])
					count++;
				
			}
			System.out.println("Array element and no of occurance"+noToCountFrequency+"....."+count);
		}

	}

}
