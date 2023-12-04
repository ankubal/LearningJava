package practiceArrayExamples;

import java.util.Scanner;

public class Fibonacci {

	void fibonacci() {
	Scanner s = new Scanner(System.in);
    //Taking input of number of elements in the series
    System.out.println("Enter the Nth term “N” ");
    int n = s.nextInt();
    int a = 1, b=1;
    System.out.print(a+" "+b);
    //for loop to print the series
    for (int i = 1; i <= n-2; i++) 
    {
        int c = a+b;
        a = b;
        b = c;
          System.out.print(" "+c);
    } 
}
}

