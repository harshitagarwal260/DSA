package ArrayInput;

import java.util.Scanner;

public class sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		  
		 System.out.println("Enter the no of elements:");
	       int m = sc.nextInt();	       
	       int ar[] = new int[m];
	       System.out.println("Enter the elemenst");
	       for(int i=0 ;i<m;i++) {
	    	   ar[i] = sc.nextInt();
	        }
	       int c0=0,c1=0,c2=0;
	       for(int i=0 ;i<m;i++) {
	    	   if(0 == ar[i]) {
	    		c0++;
	       }
	    	   if(1 == ar[i]) {
		    		c1++;
		       }
	    	   if(2 == ar[i]) {
		    		c2++;
		       }
	       }
	       for(int i=0 ;i<c0;i++)
	       System.out.print(" 0 ");
	       for(int i=0 ;i<c1;i++)
		       System.out.print(" 1 ");
	       for(int i=0 ;i<c2;i++)
		       System.out.print(" 2 ");
	       
}
}

	

