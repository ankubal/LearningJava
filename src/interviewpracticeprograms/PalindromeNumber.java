package interviewpracticeprograms;

import java.util.Scanner;

public class PalindromeNumber {
int n, rev=0, remainder; 
	public void checkPalin() {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter the number:");
		n = sc.nextInt();
		
		int c=n;
		while(n>0) {
			
			remainder = n%10;
			rev = rev*10 +remainder;
			n= n/10;
			
			
		}
		if (c==rev) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}
}
