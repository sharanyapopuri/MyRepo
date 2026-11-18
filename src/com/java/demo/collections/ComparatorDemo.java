package com.java.demo.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
	int age;
	String name;
	Student(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	 void show()
	{
		System.out.println(age+"...."+name);
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return age+"....."+name;
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Comparator<Student> com = new Comparator<>() {
			public int compare(Student s1, Student s2) {
				if (s1.age > s2.age) {
					return 1;
				} else
					return -1;
			}
		};

		
		/*
		 * Comparator<Student> com = (Student s1, Student s2) -> { return (s1.age >
		 * s2.age) ? 1 : -1; };
		 */
		 
		
		Comparator<Student> com1 = (Student s1,Student s2) -> {
			return s1.name.compareTo(s2.name);
		};
		
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(new Student(12, "sharanya"));
		stud.add(new Student(15, "sunita"));
		stud.add(new Student(8, "ram"));
		stud.add(new Student(6, "raj"));
		stud.add(new Student(20, "Allu"));

		Collections.sort(stud, com);
		for(Student st:stud)
		{
			System.out.println(st);
		}
		System.out.println("compare by name");
		Collections.sort(stud, com1);
		for(Student st:stud)
		{
			System.out.println(st);
		}
	}

}
