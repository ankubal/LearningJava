package interviewpracticeprograms;

import java.util.Scanner;

public class SwapingNumber {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
System.out.println("enter the numbers");
a= sc.nextInt();
b= sc.nextInt();
System.out.println("before swapping"+ " "+a+ " "+b);
a= a+b;
b= a-b;
a=a-b;
System.out.println("after swapping"+" " + a+ " "+b);

	}

}
