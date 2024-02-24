package interviewpracticeprograms;

import java.util.Scanner;

public class UpperToLower {
public static void main(String[] args) {
	

	StringBuilder b = new StringBuilder();

	Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
	String n = s.nextLine();

	for(int i = 0; i < n.length(); i++) {
	    char c = n.charAt(i);

	    if(Character.isLowerCase(c) == true) {
	        b.append(String.valueOf(c).toUpperCase());
	    }
	    else {
	        b.append(String.valueOf(c).toLowerCase());
	    }
	}

	System.out.println(b);
}
}