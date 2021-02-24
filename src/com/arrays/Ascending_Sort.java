package com.arrays;

public class Ascending_Sort {

	
	public static void main(String[] args) {
		
		int[] arr = {33,4,66,77,2,44,70};
		
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
				
				
			}
			System.out.println("After swapping numbers are ");
			for(int k =0;k<arr.length;k++) {
				System.out.println(arr[k]);
			}
			
			
		}
		
		
		
	}
	
}
