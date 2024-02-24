package interviewpracticeprograms;

import java.util.Scanner;

public class PostiveNegative {
int n;
	public void checkPositiveNegative() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
			n= sc.nextInt()	;
			
			if (n>0) {
				
				System.out.println("number is postive:" +n);
				
			}else if(n<0) {
				System.out.println("number is negative:" +n);
			}
	}
}
