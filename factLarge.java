package ArrayInput;


import java.util.*;

public class factLarge {

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
		Arrays.sort(ar,0,n);
		int k = ar[n-1];
		int f = 1;
		for(int i = k ; i>0 ; i--){
			 f = f*i;
		}
		System.out.println(f);
		
	}

}
