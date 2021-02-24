package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bhargavi");
		al.add("Lanka");
		al.add("venkata");
		
		ListIterator<String> listItr = al.listIterator(al.size());
/*		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		*/
		
		/*for(int i=0;i<al.size();i++) {
			System.o
			ut.println(al.get(i));
		}
		
		*/
		
	//	Iterator<String> itr = al.iterator();		
		/*al.forEach(a->
		{
			System.out.println(a);
		});*/
		
	}

}
