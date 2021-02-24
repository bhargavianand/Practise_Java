package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap3 {
	
	public static void main(String[] args) {	
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Bhargavi");
		hm.put(2, "Lanka");
		Set set = hm.entrySet();		
		Iterator itr = set.iterator();		
		while(itr.hasNext()) {			
		Map.Entry<Integer, String> mentry2 = (Map.Entry) itr.next();
		System.out.println(mentry2.getKey());
		System.out.println(mentry2.getValue());
		}
		
	}

}
