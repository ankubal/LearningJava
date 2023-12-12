package practiceArrayExamples;

import java.util.Scanner;

public class FindMaximumNumber {
	 int arr[] = {10, 11,5,55,7,324, 45, 90, 70,85}; 
	 //Scanner sc = new Scanner(System.in);
    // Method to find maximum in arr[] 
    void  largest() 
    { 
    	
    	
        int i; 
         
        // Initialize maximum element 
        int max = arr[0]; 
         
        // Traverse array elements from second and 
        // compare every element with current max 
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
        System.out.println("Largest in given array is " + max);
    } 
   
}
