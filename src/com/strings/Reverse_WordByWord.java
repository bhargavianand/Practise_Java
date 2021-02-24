package com.strings;

public class Reverse_WordByWord {

	public static void main(String[] args) {
		
		String name = "Bhargavi Lanka Venkata";
		
		String[] splitArr = name.split(" ");
		
		for(int i=splitArr.length-1;i>=0;i--) {
			
			System.out.print(splitArr[i] + " ");
		}
	}
}
