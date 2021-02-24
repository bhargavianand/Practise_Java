package com.generics;

public class GenericsFunctions1 {

	
	static <T> void genericDisplay(T element) {
		
		System.out.println(element.getClass().getName()+"=" + element);
	}
	
	
	public static void main(String[] args) {
		
		genericDisplay(11);
		genericDisplay("Bhargavi");
		genericDisplay(1.01);
		
	}
	
}
