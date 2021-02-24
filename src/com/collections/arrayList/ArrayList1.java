package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();		
		aList.add("Bhargavi");
		aList.add("Lanka");
		aList.add("Venkata");
		
		Iterator<String> itr = aList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
}
