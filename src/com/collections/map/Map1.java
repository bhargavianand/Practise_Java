package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	//The Map.Entry interface contains the getKey() and getValue() methods
	
public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
	hm.put("fruit1", "Mango");
	hm.put("fruit2", "banana");
	hm.put("fruit3", "apple");
	for(Map.Entry<String,String> m : hm.entrySet())
	{
		System.out.println(m.getKey() + " " + m.getValue());
	}
	}	
	
}
