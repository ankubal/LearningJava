package practiceArrayExamples;

import java.util.Scanner;

public class FindPrime {
	
	
	boolean prime = false;
   int num;
   Scanner sc = new Scanner(System.in);
	void findprimenumber() {
	System.out.println("enter the number");
	num = sc.nextInt();
	for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        prime = true;
	        break;
	      }
	    }

	    if (!prime)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}