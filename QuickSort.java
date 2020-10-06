package ArrayInput;

import java.util.Scanner;

public class QuickSort {

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
		QuickSort ob = new QuickSort(); 
		ob.sort(ar, 0, n-1); 

		System.out.println("sorted array"); 
		for (int i=0; i<n; ++i) 
			System.out.print(ar[i]+" "); 
		System.out.println(); 
	}
	
	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			
			int pi = partition(arr, low, high); 

			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 

		  	int partition(int arr[], int low, int high) 
			{ 
				int pivot = arr[high]; 
				int i = (low-1); // index of smaller element 
				for (int j=low; j<high; j++) 
				{ 
				// If current element is smaller than the pivot 
					if (arr[j] < pivot) 
					{ 
						i++; 

						// swap arr[i] and arr[j] 
						int temp = arr[i]; 
						arr[i] = arr[j]; 
						arr[j] = temp; 
					} 
				} 

				// swap arr[i+1] and arr[high] (or pivot) 
				int temp = arr[i+1]; 
				arr[i+1] = arr[high]; 
				arr[high] = temp; 

				return i+1; 
			} 


			
			

			
			
	}


