package ArrayInput;

import java.util.*;

public class subArray {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of elements to enter in n");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		int ar[] = new int[n];
		for(int i = 0 ; i <  n ; i++){
			 ar[i]= sc.nextInt();
		}
        
        if (subArrayExists(ar,n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");  
	}
      
    // Returns true if arr[] has a subarray with sero sum 
    static Boolean subArrayExists(int ar[],int n) 
    { 
        // Creates an empty hashset hs 
        Set<Integer> hs = new HashSet<Integer>();  
          
        // Initialize sum of elements 
        int sum = 0;      
          
        // Traverse through the given array 
        for (int i = 0; i < n; i++) 
        {  
            // Add current element to sum 
            sum += ar[i]; 
              
            // Return true in following cases 
            // a) Current element is 0 
            // b) sum of elements from 0 to i is 0 
            // c) sum is already present in hash map 
            if (ar[i] == 0 || sum == 0 || hs.contains(sum))                          
                return true; 
              
            // Add sum to hash set 
            hs.add(sum); 
        }  
          
        // We reach here only when there is 
        // no subarray with 0 sum 
        return false; 
    }  
}
		
		






