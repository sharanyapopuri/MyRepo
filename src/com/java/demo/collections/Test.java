package com.java.demo.collections;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class Test {
 public static void main(String[] args) {
     System.out.println("Start small. Ship something.");
     List<Employee> list=Arrays.asList(
         new Employee(101,"sharanya",10000,"IT"),
         new Employee(102,"maruthi",18000,"CSE"),
         new Employee(103,"kinnu",50000,"IT"),
         new Employee(104,"teena",42000,"ECE"),
         new Employee(105,"janvi",12000,"ECE"));
         //System.out.println(list.toString());
     list.stream()
     .sorted(Comparator.comparing(Employee::getDepartment)
             .thenComparing(Employee::getSalary,Comparator.reverseOrder()))
     .forEach(System.out::println);
         System.out.println("-----------");
			/*
			 * Employee emp=list.stream()
			 * .sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()))
			 * .skip(1) .findFirst() .get(); System.out.println(emp);
			 */
 }
}
class Employee
{
 private int empId;
 private String empName;
 private int salary;
 private String deptName;
 Employee(int empId,String empName,int salary,String deptName)
 {
     this.empId=empId;
     this.empName=empName;
     this.salary=salary;
     this.deptName=deptName;
 }
 public String getName()
 {
     return empName;
 }
  public int getId()
 {
     return empId;
 }
  public String getDepartment()
 {
     return deptName;
 }
  public int getSalary()
 {
     return salary;
 }
 public String toString()
 {
     return "id="+empId+"...name="+empName+"..dept="+deptName+"...salary"+salary+"\n";
 }
}
