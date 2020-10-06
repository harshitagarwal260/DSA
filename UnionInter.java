package ArrayInput;

import java.util.Scanner;

public class UnionInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter in n");
		int n = sc.nextInt();
		System.out.println("Enter the No of elements to enter in m");
		int m = sc.nextInt();
		System.out.println("Enter the elements");
		int ar[] = new int[n];
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
		System.out.println("Enter the elements");
		int br[] = new int[m];
		for(int j = 0 ; j <  m ; j++){
			 br[j]= sc.nextInt();
		}
		
		int i = 0, j = 0; 
	      while (i < m && j < n) 
	      { 
	        if (ar[i] < br[j]) 
	          System.out.print(ar[i++]+" "); 
	        else if (br[j] < ar[i]) 
	          System.out.print(br[j++]+" "); 
	        else
	        { 
	          System.out.print(br[j++]+" "); 
	          i++; 
	        } 
	      } 
		
		
	        while(i < m) {
	       System.out.print(ar[i++]+" "); 
	        break;
	        }
	      while(j < n) 
	      {
	       System.out.print(br[j++]+" "); 
          break;
	}
}
}

	
	

