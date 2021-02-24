package com.collections.arrayList;

import java.util.ArrayList;

public class ArrayList_Set {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Bhargavi"); //0
		al.add("Lanka");   //1 
		al.add("Venkata");   //2
		
		//retrieve values
		
	//	System.out.println(al.get(1));
		
		al.set(2, "Anand");
	
		
		for(String str : al) {
			System.out.println(str);
		}
		
		
		System.out.println(al.toString());
	}

}
