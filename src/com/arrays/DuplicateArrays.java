package com.arrays;

public class DuplicateArrays {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,4,2,6,5,3,5};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("arr[i]) is " + arr[i]);
					System.out.println("arr[j]) is " + arr[j]);
					System.out.println("the number is duplicate " + arr[i]);
				}
			}		
		}
	}
}
