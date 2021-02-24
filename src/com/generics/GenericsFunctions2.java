package com.generics;

import java.util.ArrayList;

public class GenericsFunctions2 {
	
	public static void m1(ArrayList<?> l) {
		
		System.out.println(l.toString());
	}

	public static void main(String[] args) {
	
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(4);
		l1.add(5);
		m1(l1);
		
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("bhargavi");
		s1.add("Lanka");
		
		
	}
	
	
	
}
