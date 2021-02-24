package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map3 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Bhargavi");
		map.put(2, "Venkata");
		map.put(3, "Lanka");
		
		//iterating through map
		
		for(Map.Entry me :map.entrySet()) {
			
			System.out.println("Key = "+ me.getKey()+  "value = " + me.getValue());
		}
	}

}
