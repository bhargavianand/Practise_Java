package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String>  al = new ArrayList<String>();
		al.add("Toyota");
		al.add("Ferrari");
		al.add("BMW");
		al.add("Benz");
		al.add("Honda");
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println(al);
	}
}
