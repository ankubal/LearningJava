package interviewpracticeprograms;

import java.util.Scanner;

public class MultiplicationTable {

	int n;
	public void printmultiplytable() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of table you want to print :");
		n = sc.nextInt();
		
		for (int i =1; i<=10;i++) {
			System.out.println(n+ "*"+ i +"="+ n*i);
		}
		
	}
}
