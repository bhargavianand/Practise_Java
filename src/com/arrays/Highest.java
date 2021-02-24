package com.arrays;

public class Highest {
	
	public static void main(String[] args) {
		
		int arr[] = {44,22,5,21,77,1,3,22,11,77,88,33,198};
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("maximum is " + max);
		
		
	}

}
