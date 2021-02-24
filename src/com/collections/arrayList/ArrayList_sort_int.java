package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_sort_int {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(2);
		al.add(1);
		
		Collections.sort(al);
		
		for(Integer a : al) {
			System.out.println(a);
		}
		
	}

}
