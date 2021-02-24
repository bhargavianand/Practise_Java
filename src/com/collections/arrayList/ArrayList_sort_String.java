package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_sort_String {
	
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Venkata");
		al.add("Bhargavi");
		al.add("Lanka");
		
		Collections.sort(al);
		
		for(String str : al) {
			System.out.println(str);
		}
		
	}
	

}
