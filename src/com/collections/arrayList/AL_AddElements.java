package com.collections.arrayList;

import java.util.ArrayList;

public class AL_AddElements {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Bhargavi"); // 0
		al.add("Lanka"); //1
		al.add("Venkata");  //2
		
		al.add(1,"Anand");  
		
		System.out.println(al);
		
		ArrayList<String> al2  = new ArrayList<String>();
		al2.add("Tester");
		al2.add("Manager");
		al.addAll(al2);
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Bangalore");
		al3.add("Canada");
		
		al.addAll(1,al3);
		System.out.println(al);
		
	}

}
