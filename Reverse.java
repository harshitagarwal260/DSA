package ArrayInput;

import java.util.Scanner;

public class Reverse {

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
	       System.out.println("Reversed array:");
	       for(int i =m-1;i>=0;i--) {
	    	   System.out.println(ar[i]);
	       }
	}

}
