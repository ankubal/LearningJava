package interviewpracticeprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class Vowel_Constant {

	char n;
	public void checkvowel() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character you want to check");
		n= (char)br.read();
		switch (n) {
		case 'a':
			System.out.println("the given character"+n+"isvowel");
			break;

		case 'e':
			System.out.println("the given character"+n+"isvowel");
			break;
		case 'i':
			System.out.println("the given character"+n+"isvowel");
			break;
		case 'o':
			System.out.println("the given character"+n+"isvowel");
			break;
			
		case 'u':
			System.out.println("the given character"+n+"isvowel");
			break;
		
		default:
			System.out.println("The given character "+n+" is consonant");
			break;
		}
		
	}
}
