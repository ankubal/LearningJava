package practiceArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	
	//int [] arr = new int[7];
	int num;
	void findsortarray() {
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter no. of elements you want in array:");
	    num = s.nextInt();
	    int a[] = new int[num];
	    System.out.println("Enter all the elements:");
	    for (int i = 0; i < num; i++) 
	    {
	        a[i] = s.nextInt();
	    }

    Arrays.sort( a );
    for ( int i = 0 ; i < a.length ; i++ ) {
        System.out.println(a[i]);
    }
}

}
