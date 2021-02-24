package basic.programs;
//ascending
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {30,22,1,33,44,44,1,6,1,6};
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
					
				}
			}
			
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k] + " ");
		}
		
	}

}
