package interviewpracticeprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int n, mult =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for (int i=1;i<=n; i++) {
		mult = mult *i;
		}
		System.out.println("factorial is :"+ mult);
	}

}
