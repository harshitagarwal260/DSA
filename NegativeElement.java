package ArrayInput;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
	       System.out.println("Enter the no of elements:");
	       int m = sc.nextInt();
	            
	       int ar[] = new int[m];
	       
	       System.out.println("Enter the elements");
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
	       
   
	     //  Arrays.sort(ar,0,m);
	       System.out.println("Sorted array:");
	       for(int i =0;i<m;i++)
	    	   System.out.print(ar[i]+" ");
	       
	     }
	}
