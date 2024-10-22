package com.javafeatures.lamdaexpression;
import java.util.*;
public class DemoCollection {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i=10;i<=15;i++) {
			 l.add(i);
		}
		Comparator<Integer> c = (I1,I2)->{
			 return (I1<I2)?1:(I1>I2)?-1:0;
		};
		Collections.sort(l ,c);
		
		System.out.println(l);

	}

}
