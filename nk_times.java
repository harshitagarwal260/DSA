package ArrayInput;

import java.util.Scanner;

public class nk_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter in n");
		int n = sc.nextInt();
		System.out.println("Enter the No of elements to enter in m");
		int k = sc.nextInt();
		System.out.println("Enter the elements");
		int ar[] = new int[n];
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
		
		
		int c= 0 ;
		for(int i = 0 ; i <  n ; i++){
			c=0;
			for(int j = 0 ; j <  n ; j++)
			if(ar[i]==ar[j]) 
				c++;
			
			if(c>n/k)
				System.out.println(ar[i]);
			System.out.println(c);
			break;
			}
	}
}

