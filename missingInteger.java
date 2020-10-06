package ArrayInput;

import java.util.Scanner;

public class missingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		int ar[] = new int[n];
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
		int sum =0;
		for(int i = 0 ; i <  n ; i++){
			sum	+=ar[i];
			
		}
		for(int i = 0 ; i <=n ; i++){
			sum	-=i;
		}
			System.out.println(sum);
		
	}
	
	

}
