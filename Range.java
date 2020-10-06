package ArrayInput;

import java.util.Scanner;

public class Range {

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
	       
	       int max=ar[0];
	       int min=ar[0];
	        
	       for(int i=1 ;i<m;i++) {
	    	 if(ar[i]> max){
	    		 max = ar[i];
	    	 }
	    	 if(ar[i]<min) {
	    		min  = ar[i];
	    	 }
	       }
	       if(min < 0)
	    	   System.out.println("Range:"+(max-min));
	       else
	    	   System.out.println("Range:"+(max+min));
	       
	       }
	       
	
	

}
