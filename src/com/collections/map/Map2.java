package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	
	public static void main(String[] args) {
			HashMap<Integer,String> hm = new HashMap<Integer,String>();
			hm.put(1,"Bhargavi");
			hm.put(2, "Lanka");
			hm.put(3, "Venkata");	
			for(Map.Entry<Integer, String> m : hm.entrySet()) {
				System.out.println(m.getKey()+ " " + m.getValue());
			}
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			map.put(4,"XYX");
			map.putAll(hm);
			for(Map.Entry<Integer,String> m1 : map.entrySet() )
			{		
				System.out.println(m1.getKey() + " " + m1.getValue());
			}			
	}
}
