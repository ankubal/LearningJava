package practiceexamples;

import java.util.Scanner;

public class oddEven {
	int n;

	public void findoddeven() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	n= sc.nextInt();
	if(n%2==0) {
		System.out.println("number is even "+ n);
	}
	else {
		System.out.println("number is odd "+ n);
	}
}
}