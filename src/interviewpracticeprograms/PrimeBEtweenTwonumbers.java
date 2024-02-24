package interviewpracticeprograms;

import java.util.Scanner;

public class PrimeBEtweenTwonumbers {
 int n1, n2,i,j;
 
	public  void checkPrime() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter n1 number");
	n1 = sc.nextInt();
	System.out.println("enter n2 number");
	n2= sc.nextInt();
		for(i=n1; i<=n2; i++) {
			for(j=2; j<=i; j++) {
				if(i%j==0) 
				break;	
				
			}
		if (i==j) 
 			System.out.println(i+ " ");
		}
			
		
	}	
}

