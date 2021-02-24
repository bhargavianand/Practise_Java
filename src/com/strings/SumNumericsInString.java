package com.strings;
/**
 * Retreiving the number from the string and converting it into int.After converting to int,
 * perform the sum of numbers;
 * @author bharg
 *
 */
public class SumNumericsInString {
	static int num=0,sum=0;
	public static void main(String[] args) {
		String str = "Bhargavi1029";
		String temp ="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				temp+=ch;
				num = Integer.parseInt(temp);
			}
		}
		System.out.println("The number retrieved from string is "+num);
		while(num!=0) {
			sum+=num%10;
			num = num/10;

		}
		System.out.println("sum of the numbers is " + sum);
	}
}
