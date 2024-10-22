package com.javafeatures.lamdaexpression;

public class Employee {
	
public int num;
public String Name;
 
 public Employee(int num,String Name) {
	 
	 this.num=num;
	 this.Name=Name;
 }
 
 public String toString() {
	 return Name+":"+num;
 }

}
