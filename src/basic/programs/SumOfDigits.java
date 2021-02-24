package basic.programs;

public class SumOfDigits {
	public static void main(String[] args) {	
	int num =1355,up,sum=0;
	while(num > 0) {
		up = num % 10;
		sum = sum + up;
		num = num/10;
		System.out.println("Number after dividing with 10" +num);	
		}
	System.out.println(sum);	
	}
}
