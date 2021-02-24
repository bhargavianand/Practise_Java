package com.arrays;

public class SecondHighest {
	
	public static void main(String[] args) {
		
		int arr[] = {44,22,55,3,2,11};
		int temp,size;
		size = arr.length;
		for(int i = 0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("second highest is "+ arr[size-2]);
		
		System.out.println("Third highest is "+ arr[size-3]);
		
		System.out.println("First highest is "+ arr[size-1]);


	}

}
