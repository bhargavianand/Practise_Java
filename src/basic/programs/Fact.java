package basic.programs;

public class Fact {
	public static void main(String[] args) {
		
	
	int num=4;
	int fact=1;
	
	for(int i=1;i<=4;i++) {
		fact = fact*i;
	}
	System.out.println("Factorial is " + fact);

	}
}
