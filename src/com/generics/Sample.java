package com.generics;

public class Sample {
	
	public static <T> void printData(T[] inputData) {
		
		for(T result : inputData) {
			
			System.out.println(result);
		}
	}

	
	public static void main(String[] args) {
		
		Integer[] arr = {1,4,6,7,3};
		Double[] dArr = {1.5,3.2,5.6,3.7};
		
		String[] sArr = {"hello","bhargavi"};
		
		printData(arr);
		printData(dArr);
		printData(sArr);

	
	}
}
