package ArrayInput;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter in r");
		int r = sc.nextInt();
		System.out.println("Enter the No of elements to enter in c");
		int c = sc.nextInt();
		System.out.println("Enter the elements");
		int ar[][] = new int[r][c];
		for(int i = 0 ; i < r; i++){
			for(int j = 0 ; j < c ; j++){
			 ar[i][j]= sc.nextInt();
		}
	}
		for(int i = 0 ; i < r; i++){
			for(int j = 0 ; j < c ; j++){
			 System.out.print(ar[i][j] + " ");
		}
			System.out.println();
	}
	}
}


