package ArrayInput;

import java.util.Scanner;

public class cyclicRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter in n");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		int ar[] = new int[n];
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
		
		int x = ar[n-1], i; 
	       for (i = n-1; i > 0; i--) 
	          ar[i] = ar[i-1]; 
	       ar[0] = x; 
		for( i = 0 ; i < n; i++){
		System.out.print(ar[i]);
		
		
		}
	}
}


