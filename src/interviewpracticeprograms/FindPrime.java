package interviewpracticeprograms;

import java.util.Scanner;

public class FindPrime {
int num;
boolean isPrime = true;

public void findprime() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	num = sc.nextInt();
	
	for(int i =2; i<num; i++)
	{
		if (num % i==0) {
			isPrime= false;
			break;
		}
	}
		if (isPrime) {
			System.out.println(num +" number is prime");
			
		}else {
			System.out.println(num + " number is not prime");
		}
	}
}

