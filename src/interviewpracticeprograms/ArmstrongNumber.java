package interviewpracticeprograms;

import java.util.Scanner;

public class ArmstrongNumber {
int n ,arm= 0, c, remainder;
	public void checkArmstrong() {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter the number:");
		n = sc.nextInt();
		
		c= n;
		
		while(n>0) {
			
		remainder = n%10;
		arm = remainder*remainder*remainder +arm;
		n=n/10;
		
		}
		if (c==arm) {
			System.out.println("number is armstrong");
		}else 
			System.out.println("number is not armstrong");
	}
}
