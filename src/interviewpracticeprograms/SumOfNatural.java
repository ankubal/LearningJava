package interviewpracticeprograms;

import java.util.Scanner;

public class SumOfNatural {
int n; 
int sum =0;
	public void CalculateSum() {
		System.out.println("enter the numbers");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		for (int i=1; i<=n;i++) {
			sum+= i;
		}
			System.out.println(sum);
			
		
	}
	
	
}
