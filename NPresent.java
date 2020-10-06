package ArrayInput;

import java.util.Scanner;

public class NPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
       System.out.println("Enter the no of elements:");
       int m = sc.nextInt();
       
       System.out.println("Enter the no to be searched:");
       int n = sc.nextInt();
       
       int ar[] = new int[m];
       System.out.println("Enter the elemenst");
       for(int i=0 ;i<m;i++) {
    	   ar[i] = sc.nextInt();
       }
      
        for(int i=0 ;i<m ;i++) {
        	System.out.println(n==ar[i]);
        	break;
//         if(n == ar[i])
//         {
//         System.out.println("true");
//         break;
//         }
//         else {
//        	 System.out.println("false");
//        	 break;
        }
      
    }
	}

