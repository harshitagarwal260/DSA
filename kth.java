package ArrayInput;

import java.util.Scanner;

public class kth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		  
		 System.out.println("Enter the no of elements:");
	       int m = sc.nextInt();
	       
	       System.out.println("Enter the kth element");
	       int k= sc.nextInt();
	       
	       int ar[] = new int[m];
	       System.out.println("Enter the elemenst");
	       for(int i=0 ;i<m;i++) {
	    	   ar[i] = sc.nextInt();
	       }
	       for(int i=0 ;i<m;i++) {
	    	   for(int j=i+1;j<m;j++) {
	    	  if(ar[i]>ar[j]) {
    		  int t = ar[i];
	    		  ar[i] = ar[j];
	    		  ar[j] = t ;
	       
	   
	}
	    	   }
	       }
	       System.out.println("Kth max and min:");
	       for(int i =0;i<m;i++) {
	    	   System.out.println("Kth max :"+ar[m-k]);
	           System.out.println("Kth min :"+ar[k-1]);
	           break;
	       }
}
}
