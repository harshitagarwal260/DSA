package ArrayInput;

import java.util.Scanner;

public class TripleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter in n");
		int n = sc.nextInt();
		
		System.out.println("Enter the No of elements to enter in m");
		int m = sc.nextInt();
		
		System.out.println("Enter the elements");
		int ar[] = new int[n];
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
		for(int i = 0 ; i <  n ; i++){
			for(int j= i+1 ; j < n ; j++){
				for(int k = j+1 ;k <  n ; k++){
					if(ar[i]+ar[j]+ar[k]==m) 
						System.out.println("1");
					break;
					
		}
	}

}
}
}

