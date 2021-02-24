package basic.programs;

public class leapYear {
	
	 static public void main(String[] args) {
	
		
		
		 int year=1700;    
		    if(((year % 4 ==0) && (year % 100 !=0))||(year%400==0)){  
		        System.out.println("LEAP YEAR");  
		    }  
		    else{  
		        System.out.println("COMMON YEAR");  
		    }  
	}    
		



	
}
