package interviewpracticeprograms;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		x= sc.nextInt();
		
		y = (int) Math.pow(x, 2);
		z= (int) Math.pow(x, 3);
		
		System.out.println("square root  is "+y);
		System.out.println("cube root is "+z);
	}

}
