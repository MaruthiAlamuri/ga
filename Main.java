package com.javafeatures.lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(1,"Maruthi"));
		l.add(new Employee(2,"Puji"));
		l.add(new Employee(2,"saru"));
		
		Comparator<Employee> c = (e1,e2) -> (e1.num < e2.num)?1:(e1.num > e2.num)?-1:0;
		
		Collections.sort(l,c);
		
		System.out.println(l);

	}

}
