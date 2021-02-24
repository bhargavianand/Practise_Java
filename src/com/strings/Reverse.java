package com.strings;
/**
 * 
 * Reverse string using chararray
 * @author bharg
 *
 */
public class Reverse {

	
	public static void main(String[] args) {
		
		
		String name = "Bhargavi";

		// convert String to character array
		char[] charArr = name.toCharArray();
		
		//reverse
		
		for(int i=charArr.length-1;i>=0;i--) {
			System.out.print(charArr[i]);
		}
			
			
		
	}
}
