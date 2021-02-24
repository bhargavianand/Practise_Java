package com.arrays;

public class ElementsCommonInTwoArrays {
	public static void main(String[] args) {
		
		
		int arr1[] = {4,3,26,66,33,7,5};
		int arr2[] = {3,55,66,44,3,1,5};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println("Element is common in two arrays is "+ arr1[i]);
					break;
				}
			}
		}
	}

}
