package ArrayInput;

import java.util.Scanner;

public class pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter");
		int n = sc.nextInt();
		System.out.println("Enter the given no.");
		int k = sc.nextInt();
		System.out.println("Enter the elements");
		int ar[] = new int[n];

		
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
		int c=0;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(ar[i]+ar[j]==k)
					c++;
			}
		}
		System.out.println(c);
	}

}
