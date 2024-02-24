package interviewpracticeprograms;

import java.util.Scanner;

public class DisplayFactors {

	public static void main(String[] args) {
		int num;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		System.out.println("the factoral number "+ " "+ "are"+ num);
		for ( i=1; i<=num; i++) {
			if(num% i==0) {
				System.out.println(i);
		}
	
		}

	}

}
