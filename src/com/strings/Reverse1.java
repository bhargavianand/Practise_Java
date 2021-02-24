package com.strings;
/**
 * 
 * Reverse string using charAt -- string method
 * @author bharg
 *
 */

public class Reverse1 {
	
	public static void main(String[] args) {
	
		String name = "Bhargavi";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			System.out.print(name.charAt(i));
		}
	
}
}
