package ArrayInput;

import java.util.Scanner;

public class Common3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter in n");
		int n = sc.nextInt();
		System.out.println("Enter the No of elements to enter in m");
		int m = sc.nextInt();
		System.out.println("Enter the No of elements to enter in p");
		int p = sc.nextInt();
		System.out.println("Enter the elements");
		int ar[] = new int[n];
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
		System.out.println("Enter the elements");
		int br[] = new int[n];
		for(int i = 0 ; i <  m ; i++){
			 br[i]= sc.nextInt();
		}
		System.out.println("Enter the elements");
		int cr[] = new int[n];
		for(int i = 0 ; i <  p ; i++){
			 cr[i]= sc.nextInt();
		}
		for(int i = 0 ; i <  n ; i++){
			for(int j = 0 ; j <  m ; j++){
				for(int k = 0 ; k < p ; k++){
					if(ar[i]==br[j] && br[j]==cr[k]) {
						System.out.println(ar[i]+" ");
						break;
					}
				}
			}
		}
	}

}
