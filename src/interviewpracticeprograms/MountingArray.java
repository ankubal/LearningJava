package interviewpracticeprograms;

import java.util.Scanner;

public class MountingArray {
int n;
boolean ismountingArray= false;
	boolean checkMountArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of elemets in array");
		n = sc.nextInt();
		
		int []arr = new int [n];
		n= arr.length;
		System.out.println("enter the elements");
		for (int i=0;i<=n;i++) {
			arr[i] = sc.nextInt();
			
			if (arr.length<3)
			return false;
				
			}
		return ismountingArray;
		
	}
}
