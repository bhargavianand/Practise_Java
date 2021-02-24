package com.strings;

public class StringBuf {
	
	public static void main(String[] args) {
		
		//String is immutable
		String s1 = new String("Bhar");
		
		s1.concat("gavi");
		System.out.println("s1 = " + s1);
		
		//But StringBuffer is mutable
		StringBuffer sb = new StringBuffer("Bhargavi");
		sb.append("Java");
		System.out.println("sb= " +sb);
		
	}

}
