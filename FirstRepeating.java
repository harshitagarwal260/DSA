package ArrayInput;

import java.util.Scanner;

public class FirstRepeating {

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
		int flag =0;
		for(int i = 0 ; i <  n ; i++){
			for(int j = i+1 ; j < n ; j++){
			if(ar[i]==ar[j]) {
				System.out.print(ar[i]);
				flag = 1;
				break;
			}
			
		}
			if(flag == 1)
			break;
			else
				continue;
	}

}
}
