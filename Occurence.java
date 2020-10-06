package ArrayInput;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		  
		 System.out.println("Enter the no of elements:");
	       int m = sc.nextInt();
	       
	       System.out.println("Enter the nth element");
	       int n= sc.nextInt();
	       
	       int ar[] = new int[m];
	       System.out.println("Enter the elemenst");
	       for(int i=0 ;i<m;i++) {
	    	   ar[i] = sc.nextInt();
	         }
	       int c=0;
	       for(int i=0 ;i<m;i++) {
	    	   if(ar[i] == n) {
	    		   c++;
	    	   }
	       }
	    	   System.out.println("Occurence of n : "+c);
	}
}
