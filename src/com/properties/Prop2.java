package com.properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Prop2 {
	
	public static void main(String[] args) {
		
		/*Properties p = System.getProperties();
		
		Set set = p.entrySet();
		
		Iterator itr = set.iterator();
	
		while(itr.hasNext()) {
			Map.Entry  entry = (Map.Entry)itr.next(); // itr.next() is object type 
			//and we are doing downcasting to Map.Entry
		System.out.println(entry.getKey() + " " + entry.getValue());
			*/
			
		
		Properties p = System.getProperties();
		
		Set set  = p.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			 Map.Entry entry = (Map.Entry)itr.next();
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	
	}

}
