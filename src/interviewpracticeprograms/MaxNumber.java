package interviewpracticeprograms;

import java.util.Scanner;

public class MaxNumber {

	int n, max;
	
	public void checkmaxnumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. elements in array :");
		n = sc.nextInt();
		int []a = new int [n];
		System.out.println("enter the elements:");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		max = a[0];
		for(int i=0; i<n; i++) {
		if(max< a[i]) {
			max = a[i];
			
		}
		}
		System.out.println(max +"is maximum number");
	}
}
